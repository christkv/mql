// Establish the root object, `window` in the browser, or `global` on the server.
var root = this; 

// Create a refeence to this
var _ = new Object();
var isNode = false;

// Export the Underscore object for **CommonJS**, with backwards-compatibility
// for the old `require()` API. If we're not in CommonJS, add `_` to the
// global object.
if (typeof module !== 'undefined' && module.exports) {
  module.exports = _;
  root._ = _;
  isNode = true;
} else {
  root._ = _;
}

// Set up basic parser
var SQLParser = exports.SQLParser = function() {
}

var stringToBytes = function(string) {
  // If we are in node return a buffer
  if(isNode) return new Buffer(string);
  // Otherwise an array
  var bytes = [];  
  for(var i = 0; i < string.length; i++) {
    bytes[i] = string.charCodeAt(i);
  }
  return bytes;
};

var bytesToString = function(bytes) {
  if(typeof bytes.write == 'function') {
    // Node.js
    return bytes.toString('utf-8');
  } else {
    var result = "";
    for(var b in bytes) {
      result += String.fromCharCode(bytes[b]);
    }
    return result;
  }
};


%%{
    machine sql_tables;

    action selectStatement {
      // Identify select
      console.log("select :: " + p)
    }

    action fromStatement {
      // Identify from
      console.log("from")
    }
    
    action whereStatement {
      // Identify where
      console.log("where")      
    }

    action fieldsStart {
      // Cut out the fields
      item = p
    }
    action fieldsEnd {      
      // Split up the fields
      var fieldStrings = data.slice(item, p).toString().trim().split(/\,/);
      // Add them to the list of fields to query
      for(var i = 0; i < fieldStrings.length; i++) {
        query.fields[fieldStrings[i].trim()] = 1;
      }      
    }

    action tableStart {
      // Cut out the table name
      item = p;
    }
    action tableEnd {   
      query.from = data.slice(item, p).toString();
    }

    _select = 'select'i @selectStatement;
    _from = 'from'i space+ @fromStatement;
    _where = (space* 'where'i space+ @whereStatement);
    _as = space+ 'as'i space+;
    undefined_stuff = (space+ any+ space+)+;
    name = '`'? [a-zA-Z_][a-zA-Z_0-9]* '`'?;
    extended_name = (name '.')? name;
    table_name = extended_name >tableStart %tableEnd;
    table_alias = name;
    table = table_name (_as table_alias)?;
    fields = undefined_stuff >fieldsStart %fieldsEnd;

    main :=
      '('? _select fields _from table (_where table)* ')'?
    ;

}%%
%% write data;

// '('? _select fields _from table (_join table)* ')'?
// _join = (space* ',' space*|(space+ ('inner'i|'left'i|'right'i|'outer'i))? space+ 'join'i space+);

SQLParser.prototype.scan = function(statement) {
  // We have a Buffer, use that
  var data = typeof statement.write == 'function' ? statement : stringToBytes(statement);

  // Set up internal variables for use during the state-machine execution
  var cs = 0;
  var p = 0;
  var pe = data.length;
  var eof = data.length;
  var item = 0;
  var stack = new Array(1024);
  var stack_size = 1;
  var top = 0;
  
  // Set up internal storage variables express the statement
  var query = {fields:{}, from:null, where:{}};
    
  %% write init;
  %% write exec;      

  console.log("----------------------------------------------------------------")
  console.dir(query)
}
    
var _p = new SQLParser();
_p.scan("select a.done,b from atable where a");
    