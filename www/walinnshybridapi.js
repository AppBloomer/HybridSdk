cordova.define("com.walinns.walinnshybrid.walinnshybridapi", function(require, exports, module) {
var exec = require('cordova/exec');

exports.coolMethod = function (arg0, success, error) {
    exec(success, error, 'walinnshybridapi', 'coolMethod', [arg0]);
};

exports.trackEvent = function (arg0, success, error) {
    exec(success, error, 'walinnshybridapi', 'trackEvent', [arg0]);
};

exports.trackScreen = function (arg0, success, error) {
    exec(success, error, 'walinnshybridapi', 'trackScreen', [arg0]);
};

});
