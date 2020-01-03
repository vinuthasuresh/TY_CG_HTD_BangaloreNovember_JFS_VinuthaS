"use strict";
console.log("Typescript code started");
var a = 100;
//a='string'; error !! we cannot reassign type number to string
a = null;
var b; //implicitly it is considered as any
b = 200;
b = "vinutha";
console.log(b);
var marks = [1, 2, 4, 5,];
var student;
student = {
    name: 'xya',
    age: 23,
    pass: true
};
var Sample = /** @class */ (function () {
    function Sample() {
        this.a = 100;
        this.b = 'abc';
    }
    return Sample;
}());
var sample1 = new Sample();
console.log(sample1.a);
console.log(sample1.b);
var Studentt = /** @class */ (function () {
    function Studentt(name, age, USN, marks) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
    }
    Studentt.prototype.printDetails = function () {
        console.log("\n            Name is " + this.name + ",\n            Age is " + this.age + ",\n            USN is " + this.USN + ",\n            Marks is " + this.marks + "\n            ");
    };
    return Studentt;
}());
var student2 = new Student('vinutha', 23, '1MV15TE053', 70);
console.log('student name is', student2.name);
console.log('age is ', student2.age);
console.log("Typescript code ended");
