//Functions
function demo(){
    console.log(a);
    var b=100;
    console.log("function demo is being called");

}
//console.log(b);
//throws error b is not defined
//it is a local scoped variable
demo();//function calling

function add(a, b){
    return a+b;


}
console.log(add(1,2));

var test=function(){
    console.log("anonymous function assigned to variable test");

}
test();

//Immediately invoke function expression
(function (a, b){
    var name="varshini";
    console.log(a+b);
    console.log("Inside the function",name);
    console.log('IIFE running');//In order to invoke localscope variables
})(11, 21);
console.log('outside function ', name);


//callback function
function sample(x){
    console.log("sample function started");
    x();
    console.log("sample function ended");
}
sample(function(){
    console.log("callback function calling")
});





















