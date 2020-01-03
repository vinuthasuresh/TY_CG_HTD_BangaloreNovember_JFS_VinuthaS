console.log("javascript started");

setTimeout(function(){
    console.log("10 seconds done");
}, 10000);

console.log('javascript ended');//asysnchronous 

// console.log("javascript started");

// var i=0;

// setInterval(function(){
//     console.log(i);
//     i++;
//     console.log("1 sec done");

// },1000)
// console.log("javascript ended");

//FatHarrowfunction
//single arrow fatharrowfunction
var test=(a,b)=> a*b;//if we have only one return statement 
console.log(test(12,22));

var demo=a=>a*5;//if we have one argument then we can ignore braces()
console.log(demo(12));

// if(true){
//     let a=100;
// }
// console.log(a);//a is not defined beacause let is block scoped

let a=100;
let a='xyz';
console.log(a);//using let keyword we can't re declare the variable












