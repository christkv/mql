
// line 1 "sql.rl"
package de.uwefleischer.statemachines;

import java.util.Set;
import java.util.TreeSet;

public class Sql {

    private static Set<String> tables;


// line 44 "sql.rl"


// line 17 "sql.java"
private static byte[] init__sql_tables_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    1,    1,    2,    1,    3,    2,    1,    3
	};
}

private static final byte _sql_tables_actions[] = init__sql_tables_actions_0();


private static short[] init__sql_tables_key_offsets_0()
{
	return new short [] {
	    0,    0,    3,    5,    7,    9,   11,   13,   15,   18,   18,   21,
	   26,   31,   36,   41,   44,   54,   72,   80,   90,   98,  106,  121,
	  136,  152,  157,  162,  167,  172,  175,  182,  187,  192,  197,  200,
	  205,  210,  215,  220,  225,  230,  235,  240,  253,  266,  281,  289,
	  302,  310,  315,  318,  328,  341,  356,  359,  371,  376,  391,  406,
	  419,  434,  447,  461,  473,  478,  490,  504,  518,  532,  544,  559,
	  574,  589,  602,  608,  622,  636,  650
	};
}

private static final short _sql_tables_key_offsets[] = init__sql_tables_key_offsets_0();


private static char[] init__sql_tables_trans_keys_0()
{
	return new char [] {
	   40,   83,  115,   83,  115,   69,  101,   76,  108,   69,  101,   67,
	   99,   84,  116,   32,    9,   13,   32,    9,   13,   32,   70,  102,
	    9,   13,   32,   82,  114,    9,   13,   32,   79,  111,    9,   13,
	   32,   77,  109,    9,   13,   32,    9,   13,   32,   70,   96,  102,
	    9,   13,   65,   90,   95,  122,   32,   44,   65,   70,   73,   74,
	   76,   79,   82,   97,  102,  105,  106,  108,  111,  114,    9,   13,
	   32,   96,    9,   13,   65,   90,   95,  122,   32,   70,   96,  102,
	    9,   13,   65,   90,   95,  122,   32,   96,    9,   13,   65,   90,
	   95,  122,   32,   95,    9,   13,   65,   90,   97,  122,   32,   44,
	   65,   70,   74,   96,   97,  102,  106,    9,   13,   66,   90,   95,
	  122,   32,   44,   65,   70,   74,   96,   97,  102,  106,    9,   13,
	   66,   90,   95,  122,   32,   44,   70,   73,   74,   76,   79,   82,
	  102,  105,  106,  108,  111,  114,    9,   13,   32,   78,  110,    9,
	   13,   32,   78,  110,    9,   13,   32,   69,  101,    9,   13,   32,
	   82,  114,    9,   13,   32,    9,   13,   32,   70,   74,  102,  106,
	    9,   13,   32,   79,  111,    9,   13,   32,   73,  105,    9,   13,
	   32,   78,  110,    9,   13,   32,    9,   13,   32,   69,  101,    9,
	   13,   32,   70,  102,    9,   13,   32,   84,  116,    9,   13,   32,
	   85,  117,    9,   13,   32,   84,  116,    9,   13,   32,   73,  105,
	    9,   13,   32,   71,  103,    9,   13,   32,   72,  104,    9,   13,
	   32,   44,   70,   74,   96,  102,  106,    9,   13,   65,   90,   95,
	  122,   32,   44,   70,   74,   96,  102,  106,    9,   13,   65,   90,
	   95,  122,   32,   44,   65,   70,   74,   96,   97,  102,  106,    9,
	   13,   66,   90,   95,  122,   32,   95,    9,   13,   65,   90,   97,
	  122,   32,   44,   70,   74,   96,  102,  106,    9,   13,   65,   90,
	   95,  122,   32,   95,    9,   13,   65,   90,   97,  122,   32,   83,
	  115,    9,   13,   32,    9,   13,   32,   70,   96,  102,    9,   13,
	   65,   90,   95,  122,   32,   41,   44,   46,   96,    9,   13,   48,
	   57,   65,   90,   95,  122,   32,   41,   44,   46,   82,   96,  114,
	    9,   13,   48,   57,   65,   90,   95,  122,   32,    9,   13,   32,
	   41,   44,   96,    9,   13,   48,   57,   65,   90,   95,  122,   32,
	   41,   44,    9,   13,   32,   41,   44,   46,   79,   96,  111,    9,
	   13,   48,   57,   65,   90,   95,  122,   32,   41,   44,   46,   77,
	   96,  109,    9,   13,   48,   57,   65,   90,   95,  122,   32,   41,
	   44,   46,   96,    9,   13,   48,   57,   65,   90,   95,  122,   32,
	   41,   44,   46,   83,   96,  115,    9,   13,   48,   57,   65,   90,
	   95,  122,   32,   41,   44,   46,   96,    9,   13,   48,   57,   65,
	   90,   95,  122,   32,   41,   44,   83,   96,  115,    9,   13,   48,
	   57,   65,   90,   95,  122,   32,   41,   44,   96,    9,   13,   48,
	   57,   65,   90,   95,  122,   32,   41,   44,    9,   13,   32,   41,
	   44,   96,    9,   13,   48,   57,   65,   90,   95,  122,   32,   41,
	   44,   82,   96,  114,    9,   13,   48,   57,   65,   90,   95,  122,
	   32,   41,   44,   79,   96,  111,    9,   13,   48,   57,   65,   90,
	   95,  122,   32,   41,   44,   77,   96,  109,    9,   13,   48,   57,
	   65,   90,   95,  122,   32,   41,   44,   96,    9,   13,   48,   57,
	   65,   90,   95,  122,   32,   41,   44,   46,   79,   96,  111,    9,
	   13,   48,   57,   65,   90,   95,  122,   32,   41,   44,   46,   73,
	   96,  105,    9,   13,   48,   57,   65,   90,   95,  122,   32,   41,
	   44,   46,   78,   96,  110,    9,   13,   48,   57,   65,   90,   95,
	  122,   32,   41,   44,   46,   96,    9,   13,   48,   57,   65,   90,
	   95,  122,   32,   41,   44,   46,    9,   13,   32,   41,   44,   79,
	   96,  111,    9,   13,   48,   57,   65,   90,   95,  122,   32,   41,
	   44,   73,   96,  105,    9,   13,   48,   57,   65,   90,   95,  122,
	   32,   41,   44,   78,   96,  110,    9,   13,   48,   57,   65,   90,
	   95,  122,   32,   41,   44,   96,    9,   13,   48,   57,   65,   90,
	   95,  122,    0
	};
}

private static final char _sql_tables_trans_keys[] = init__sql_tables_trans_keys_0();


private static byte[] init__sql_tables_single_lengths_0()
{
	return new byte [] {
	    0,    3,    2,    2,    2,    2,    2,    2,    1,    0,    1,    3,
	    3,    3,    3,    1,    4,   16,    2,    4,    2,    2,    9,    9,
	   14,    3,    3,    3,    3,    1,    5,    3,    3,    3,    1,    3,
	    3,    3,    3,    3,    3,    3,    3,    7,    7,    9,    2,    7,
	    2,    3,    1,    4,    5,    7,    1,    4,    3,    7,    7,    5,
	    7,    5,    6,    4,    3,    4,    6,    6,    6,    4,    7,    7,
	    7,    5,    4,    6,    6,    6,    4
	};
}

private static final byte _sql_tables_single_lengths[] = init__sql_tables_single_lengths_0();


private static byte[] init__sql_tables_range_lengths_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,    1,    1,
	    1,    1,    1,    1,    3,    1,    3,    3,    3,    3,    3,    3,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    1,    1,    3,    3,    3,    3,    3,
	    3,    1,    1,    3,    4,    4,    1,    4,    1,    4,    4,    4,
	    4,    4,    4,    4,    1,    4,    4,    4,    4,    4,    4,    4,
	    4,    4,    1,    4,    4,    4,    4
	};
}

private static final byte _sql_tables_range_lengths[] = init__sql_tables_range_lengths_0();


private static short[] init__sql_tables_index_offsets_0()
{
	return new short [] {
	    0,    0,    4,    7,   10,   13,   16,   19,   22,   25,   26,   29,
	   34,   39,   44,   49,   52,   60,   78,   84,   92,   98,  104,  117,
	  130,  146,  151,  156,  161,  166,  169,  176,  181,  186,  191,  194,
	  199,  204,  209,  214,  219,  224,  229,  234,  245,  256,  269,  275,
	  286,  292,  297,  300,  308,  318,  330,  333,  342,  347,  359,  371,
	  381,  393,  403,  414,  423,  428,  437,  448,  459,  470,  479,  491,
	  503,  515,  525,  531,  542,  553,  564
	};
}

private static final short _sql_tables_index_offsets[] = init__sql_tables_index_offsets_0();


private static byte[] init__sql_tables_indicies_0()
{
	return new byte [] {
	    0,    2,    2,    1,    2,    2,    1,    3,    3,    1,    4,    4,
	    1,    5,    5,    1,    6,    6,    1,    7,    7,    1,    8,    8,
	    1,    9,   10,   10,    9,   10,   11,   11,   10,    9,   10,   12,
	   12,   10,    9,   10,   13,   13,   10,    9,   10,   14,   14,   10,
	    9,   15,   15,    9,   15,   17,   18,   17,   15,   16,   16,    9,
	   19,   20,   21,   11,   22,   23,   24,   25,   26,   21,   11,   22,
	   23,   24,   25,   26,   19,    9,   27,   18,   27,   16,   16,    9,
	   27,   17,   18,   17,   27,   16,   16,    9,   10,   29,   10,   28,
	   28,    9,   10,   28,   10,   28,   28,    9,   30,   20,   31,   17,
	   32,   18,   31,   17,   32,   30,   16,   16,    9,   33,   20,   34,
	   36,   37,   38,   34,   36,   37,   33,   35,   35,    9,   39,   20,
	   11,   22,   23,   24,   25,   26,   11,   22,   23,   24,   25,   26,
	   39,    9,   10,   40,   40,   10,    9,   10,   41,   41,   10,    9,
	   10,   42,   42,   10,    9,   10,   43,   43,   10,    9,   44,   44,
	    9,   44,   11,   23,   11,   23,   44,    9,   10,   45,   45,   10,
	    9,   10,   46,   46,   10,    9,   10,   47,   47,   10,    9,   27,
	   27,    9,   10,   48,   48,   10,    9,   10,   49,   49,   10,    9,
	   10,   43,   43,   10,    9,   10,   50,   50,   10,    9,   10,   41,
	   41,   10,    9,   10,   51,   51,   10,    9,   10,   52,   52,   10,
	    9,   10,   49,   49,   10,    9,   53,   20,   36,   37,   38,   36,
	   37,   53,   35,   35,    9,   54,   20,   17,   32,   18,   17,   32,
	   54,   16,   16,    9,   55,   20,   31,   17,   32,   18,   31,   17,
	   32,   55,   16,   16,    9,   10,   56,   10,   56,   56,    9,   57,
	   20,   17,   32,   18,   17,   32,   57,   16,   16,    9,   10,   35,
	   10,   35,   35,    9,   10,   58,   58,   10,    9,   59,   59,    9,
	   59,   36,   38,   36,   59,   35,   35,    9,   60,   61,   62,   63,
	   64,   60,   56,   56,   56,    9,   60,   61,   62,   63,   65,   64,
	   65,   60,   56,   56,   56,    9,   10,   10,    9,   60,   61,   62,
	   66,   60,   28,   28,   28,    9,   60,   61,   62,   60,    9,   60,
	   61,   62,   63,   67,   64,   67,   60,   56,   56,   56,    9,   60,
	   61,   62,   63,   68,   64,   68,   60,   56,   56,   56,    9,   69,
	   61,   62,   63,   64,   69,   56,   56,   56,    9,   60,   61,   62,
	   63,   70,   64,   70,   60,   56,   56,   56,    9,   71,   61,   62,
	   63,   64,   71,   56,   56,   56,    9,   39,   72,   20,   73,   74,
	   73,   39,   35,   35,   35,    9,   39,   72,   20,   74,   39,   35,
	   35,   35,    9,   39,   72,   20,   39,    9,   53,   72,   20,   74,
	   53,   35,   35,   35,    9,   39,   72,   20,   75,   74,   75,   39,
	   35,   35,   35,    9,   39,   72,   20,   76,   74,   76,   39,   35,
	   35,   35,    9,   39,   72,   20,   77,   74,   77,   39,   35,   35,
	   35,    9,   54,   72,   20,   74,   54,   35,   35,   35,    9,   60,
	   61,   62,   63,   78,   64,   78,   60,   56,   56,   56,    9,   60,
	   61,   62,   63,   79,   64,   79,   60,   56,   56,   56,    9,   60,
	   61,   62,   63,   80,   64,   80,   60,   56,   56,   56,    9,   81,
	   61,   62,   63,   64,   81,   56,   56,   56,    9,   60,   61,   62,
	   63,   60,    9,   39,   72,   20,   82,   74,   82,   39,   35,   35,
	   35,    9,   39,   72,   20,   83,   74,   83,   39,   35,   35,   35,
	    9,   39,   72,   20,   84,   74,   84,   39,   35,   35,   35,    9,
	   57,   72,   20,   74,   57,   35,   35,   35,    9,    0
	};
}

private static final byte _sql_tables_indicies[] = init__sql_tables_indicies_0();


private static byte[] init__sql_tables_trans_targs_0()
{
	return new byte [] {
	    2,    0,    3,    4,    5,    6,    7,    8,    9,   10,   11,   12,
	   13,   14,   15,   16,   52,   53,   46,   17,   18,   49,   25,   31,
	   35,   38,   40,   19,   55,   21,   22,   60,   70,   23,   62,   63,
	   66,   75,   48,   24,   26,   27,   28,   29,   30,   32,   33,   34,
	   36,   37,   39,   41,   42,   43,   44,   45,   52,   47,   50,   51,
	   17,   54,   18,   20,   74,   57,   56,   58,   59,   22,   61,   23,
	   54,   65,   64,   67,   68,   69,   71,   72,   73,   45,   76,   77,
	   78
	};
}

private static final byte _sql_tables_trans_targs[] = init__sql_tables_trans_targs_0();


private static byte[] init__sql_tables_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    1,    0,    0,    0,    0,
	    0,    0,    0,    3,    5,    5,    5,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    3,    5,    5,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    3,    0,    0,    0,    0,    0,
	    7,    7,    7,    0,    0,    0,    0,    0,    0,    9,    0,    7,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    7,    0,    0,
	    0
	};
}

private static final byte _sql_tables_trans_actions[] = init__sql_tables_trans_actions_0();


private static byte[] init__sql_tables_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    7,    7,    0,    7,    7,    7,    7,    7,
	    7,    7,    0,    0,    0,    0,    0,    0,    0,    0,    7,    7,
	    7,    7,    7,    0,    0,    0,    0
	};
}

private static final byte _sql_tables_eof_actions[] = init__sql_tables_eof_actions_0();


static final int sql_tables_start = 1;
static final int sql_tables_first_final = 52;
static final int sql_tables_error = 0;

static final int sql_tables_en_main = 1;


// line 46 "sql.rl"

    public static Set<String> getTables(String statement) {
        tables = new TreeSet<String>();
        char[] data = statement.toCharArray();
        int cs, p = 0, pe = data.length, eof = data.length, item = 0;
        int stack[] = new int[1024];
        int stack_size = 1;
        int top;
        
// line 281 "sql.java"
	{
	cs = sql_tables_start;
	}

// line 55 "sql.rl"
        
// line 288 "sql.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _sql_tables_key_offsets[cs];
	_trans = _sql_tables_index_offsets[cs];
	_klen = _sql_tables_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _sql_tables_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _sql_tables_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _sql_tables_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _sql_tables_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _sql_tables_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _sql_tables_indicies[_trans];
	cs = _sql_tables_trans_targs[_trans];

	if ( _sql_tables_trans_actions[_trans] != 0 ) {
		_acts = _sql_tables_trans_actions[_trans];
		_nacts = (int) _sql_tables_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _sql_tables_actions[_acts++] )
			{
	case 0:
// line 13 "sql.rl"
	{
        System.out.println("select");
    }
	break;
	case 1:
// line 16 "sql.rl"
	{
        System.out.println("from");
    }
	break;
	case 2:
// line 19 "sql.rl"
	{
        item = p;
    }
	break;
	case 3:
// line 22 "sql.rl"
	{
        String tableName = new String(data, item, p-item);
        tableName = tableName.replaceAll("`", "");
        System.out.println(tableName);
        tables.add(tableName);
    }
	break;
// line 395 "sql.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
	if ( p == eof )
	{
	int __acts = _sql_tables_eof_actions[cs];
	int __nacts = (int) _sql_tables_actions[__acts++];
	while ( __nacts-- > 0 ) {
		switch ( _sql_tables_actions[__acts++] ) {
	case 3:
// line 22 "sql.rl"
	{
        String tableName = new String(data, item, p-item);
        tableName = tableName.replaceAll("`", "");
        System.out.println(tableName);
        tables.add(tableName);
    }
	break;
// line 425 "sql.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 56 "sql.rl"
        return tables;
    }

}