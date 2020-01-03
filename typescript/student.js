"use strict";
var Student = /** @class */ (function () {
    function Student(name, age, USN, marks, adharNo, panNo) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
        this.adharNo = adharNo;
        this.panNo = panNo;
    }
    return Student;
}());
var student1 = {
    name: "john",
    age: 20,
    USN: 'JWDJB123',
    marks: 15
};
var student8 = new Student('john', 20, 'JWDJB123', 15, undefined, 'AJBDJ67');
var clearedStudents = [
    new Student('vinutha', 23, 'ed45nf', 70),
    new Student('kelvin', 24, 'jgdjee34', 76)
];
console.log(clearedStudents);
