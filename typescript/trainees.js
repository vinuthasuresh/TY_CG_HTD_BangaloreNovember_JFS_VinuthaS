"use strict";
var Training = /** @class */ (function () {
    function Training() {
        this.name = 'abc';
        this.age = 21;
    }
    Training.prototype.printData = function () {
        console.log("helllo");
    };
    return Training;
}());
var tranie1 = {
    name: 'kelvin',
    age: 33,
    printData: function () {
        console.log(this.name, this.age);
    }
};
