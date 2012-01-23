package de.uwefleischer.statemachines;

import java.util.Set;
import java.util.TreeSet;

public class Sql {

    private static Set<String> tables;

%%{
    machine sql_tables;

    action selectStatement {
        System.out.println("select");
    }
    action fromStatement {
        System.out.println("from");
    }
    action tableStart {
        item = p;
    }
    action tableEnd {
        String tableName = new String(data, item, p-item);
        tableName = tableName.replaceAll("`", "");
        System.out.println(tableName);
        tables.add(tableName);
    }

    _select = 'select'i @selectStatement;
    _from = 'from'i space+ @fromStatement;
    _join = (space* ',' space*|(space+ ('inner'i|'left'i|'right'i|'outer'i))? space+ 'join'i space+);
    _as = space+ 'as'i space+;
    undefined_stuff = (space+ any+ space+)+;
    name = '`'? [a-zA-Z_][a-zA-Z_0-9]* '`'?;
    extended_name = (name '.')? name;
    table_name = extended_name >tableStart %tableEnd;
    table_alias = name;
    table = table_name (_as table_alias)?;

    main :=
        '('? _select undefined_stuff _from table (_join table)* ')'?
    ;

}%%
%% write data;

    public static Set<String> getTables(String statement) {
        tables = new TreeSet<String>();
        char[] data = statement.toCharArray();
        int cs, p = 0, pe = data.length, eof = data.length, item = 0;
        int stack[] = new int[1024];
        int stack_size = 1;
        int top;
        %% write init;
        %% write exec;
        return tables;
    }

}