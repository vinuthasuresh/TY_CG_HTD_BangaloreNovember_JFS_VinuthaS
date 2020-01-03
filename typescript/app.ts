console.log("Typescript code started");

let a=100;
//a='string'; error !! we cannot reassign type number to string
a=null;
let b;//implicitly it is considered as any

b=200;

b="vinutha";
console.log(b);
let marks: number[] =[1, 2, 4,5, ];

let student: {name: string, age:number, pass:boolean};
student={
    name:'xya',
    age:23,
    pass:true
}
class Sample {
    a=100;
    b= 'abc';

}
let sample1 = new Sample();
console.log(sample1.a);
console.log(sample1.b);

 class Studentt{
    
    constructor(
        public name: string,
        public age: number,
        public USN: string,
        public marks: number){

        }
    printDetails(): void{
        console.log(`
            Name is ${this.name},
            Age is ${this.age},
            USN is ${this.USN},
            Marks is ${this.marks}
            `);
    
        }
}
let student2 = new Student('vinutha', 23, '1MV15TE053', 70);
console.log('student name is' , student2.name);
console.log('age is ', student2.age);




console.log("Typescript code ended");

