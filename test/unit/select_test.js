var Mql = require('../../lib/mql').Mql;
// console.dir(parser)

exports.testSomething = function(test){
  // try {
  var mql = new Mql();

  var count = 1000;
  var startTime = new Date().getTime();
    
  // var result = parser.parse("SELECT abc FROM bcd WHERE name = 'ole'")
  for(var i = 0; i < count; i++) {
    var query = mql.parse("SELECT abc FROM bcd WHERE name = 'ole' AND login = 'damn'")    
  }
  
  var endTime = new Date().getTime();
  console.log("================= " + ((endTime - startTime)/count))
  
  var query = mql.parse("SELECT abc FROM bcd WHERE name = 'ole' AND login = 'damn'")  
  
  // console.log("====================================================== query object")
  // console.dir(query)
  test.done();
};