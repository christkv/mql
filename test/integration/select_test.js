// var mongodb = process.env['TEST_NATIVE'] != null ? require('../lib/mongodb').native() : require('../lib/mongodb').pure();
var mongodb = require('mongodb');

/*!
 * Module dependencies.
 */
var Db = mongodb.Db,
  Cursor = mongodb.Cursor,
  Collection = mongodb.Collection,
  Server = mongodb.Server,
  Mql = require('../../lib/mql').Mql;

var MONGODB = 'integration_tests';
var client = new Db(MONGODB, new Server("127.0.0.1", 27017, {auto_reconnect: true, poolSize: 1, ssl:false}), {native_parser: false});

/**
 * Retrieve the server information for the current
 * instance of the db client
 * 
 * @ignore
 */
exports.setUp = function(callback) {
  var self = this;  
  client.open(function(err, db_p) {
    if(numberOfTestsRun == (Object.keys(self).length - 2)) {
      // If first test drop the db
      client.dropDatabase(function(err, done) {
        callback();
      });
    } else {
      return callback();
    }
  });
}

/**
 * Retrieve the server information for the current
 * instance of the db client
 * 
 * @ignore
 */
exports.tearDown = function(callback) {
  var self = this;
  numberOfTestsRun = numberOfTestsRun - 1;
  // Drop the database and close it
  if(numberOfTestsRun <= 0) {
    client.dropDatabase(function(err, done) {
      client.close();
      callback();
    });
  } else {
    client.close();
    callback();
  }
}

/**
 * Retrieve the server information for the current
 * instance of the db client
 * 
 * @ignore
 */
exports.shouldCorrectlyMatchMqlWithManualCheck = function(test) {
  var collection = client.collection('shouldCorrectlyMatchMqlWithManualCheck');
  collection.insert([{name:'jones', login:'jonesk'}, {name:'peter', login:'sellers'}], {safe:true}, function(err, result) {
    var mql = new Mql(client);
    mql.executeStmt("SELECT name FROM shouldCorrectlyMatchMqlWithManualCheck WHERE name = 'jones' AND login = 'jonesk'",
      function(err, items) {
        test.ok(err == null);
        console.dir(items)        
        test.done();            
    });    
  });
}

/**
 * Retrieve the server information for the current
 * instance of the db client
 * 
 * @ignore
 */
var numberOfTestsRun = Object.keys(this).length - 2;