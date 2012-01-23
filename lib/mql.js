var parser = require('./mql-parser');

var Mql = exports.Mql = function(db) {  
  this.db = db;
}

Mql.prototype.executeStmt = function(query, callback) {
  // Parse the query
  var query = this.parse(query);
  // console.dir(query)  
  // Fetch the collection
  var collection = this.db.collection(query.from);
  // Peform the find
  var cursor = collection.find(query.where, {fields:query.fields});
  // Peform query and return results
  cursor.toArray(callback);
}

Mql.prototype.parse = function(query) {
  var result = parser.parse(query)
  // Final query
  var query = {fields:{}, from:null, where:{}};
  var currentQueryObject = query.where;
  var inFrom = false;
  var inSelect = false;
  var inWhere = false;
  var inAnd = false;
  // For parsing object
  var objectName = null;
  
  result.traverse({
    traversesTextNodes:false, 

    enteredNode:function(aNode) {
      // console.log("-------------------------------------------- enteredNode :: " + aNode.name)
      // console.dir(aNode)
      
      if(aNode.name == 'from') {
        inFrom = true;
      } else if(aNode.name == 'select') {
        inSelect = true;
      } else if(aNode.name == 'where') {
        inWhere = true;
      } else if(aNode.name == 'and') {
        inAnd = true;
        // Setup current object for and operation
        currentQueryObject['$and'] = [];
        currentQueryObject = currentQueryObject['$and'];
      }
    },

    exitedNode:function(aNode) {                  
      if(aNode.name == 'from') {
        inFrom = true;
      } else if(aNode.name == "variable") {
        if(inFrom) {
          query.from = aNode.source.substr(aNode.range.location, aNode.range.length);
          inFrom = false;
        } else {
          query.fields[aNode.source.substr(aNode.range.location, aNode.range.length)] = 1;
        }
      } else if(aNode.name == "field") {
        objectName = aNode.source.substr(aNode.range.location, aNode.range.length);
      } else if(aNode.name == "string") {        
        if(inAnd) {
          var andObject = new Object();
          andObject[objectName] = aNode.source.substr(aNode.range.location, aNode.range.length);
          currentQueryObject.push(andObject);
        } else {
          currentQueryObject[objectName] = aNode.source.substr(aNode.range.location, aNode.range.length);          
        }
      }
    }    
  });  
  
  // Return parsed and translated query object
  return query;
}