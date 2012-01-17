var parser = require('../lib/mql-parser');
// console.dir(parser)

exports.testSomething = function(test){
  // try {
    
  // var result = parser.parse("SELECT abc FROM bcd WHERE name = 'ole'")
  var result = parser.parse("SELECT abc FROM bcd WHERE name = 'ole' AND login = 'damn'")
    // var result = parser.parse("function() { var a = b; }")
    // var result = parser.parse("SELECT a FROM b;")
  // } catch(err) {
  //   console.dir(err)
  // }
  
  // Final query
  var query = {fields:[], from:null, where:{}};
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
          query.fields.push(aNode.source.substr(aNode.range.location, aNode.range.length));
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
  
  console.log("====================================================== query object")
  console.dir(query)
  // console.dir(result)
  // test.expect(1);
  // test.ok(true, "this assertion should pass");
  // test.done();
  test.done();
};