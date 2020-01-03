//console.log("Hi welcome to JS Class");
//Datatypes
//variable declarataion
var a;

//variable initialisation
a=100;

console.log('value of a is '+a);
console.log(typeof a);

var name="vinutha";
console.log(name);
console.log(typeof name);

var age=23;

var details=`The name is ${name} and age is ${age}`;
console.log(details);

console.log(`The sum of 10 and 6 is${10 + 6}`);


var sampleText=` Lorem ipsum dolor sit amet consectetur adipisicing elit. Placeat nam corporis dicta repudiandae illo eveniet doloribus, quasi assumenda quae dignissimos?
Consequuntur et, aperiam fugiat aliquam perferendis ratione doloremque molestiae autem`;
console.log(sampleText);

var icompascleared = true;

console.log(typeof icompascleared);

var a;
console.log(typeof a);

var empty=null;

console.log(typeof empty);

//operators
if(true=='true'){
    console.log('true block');
}else{
    console.log('false block');//when we use == 
}

if(null===undefined){
    console.log("true block");
}else{
    console.log("false block");//
}


//alert('Are you fine?');//display pop-up message
var userConfirmation=confirm("Are you sure?");
console.log(userConfirmation);

if(userConfirmation){
    console.log("the user selected ok");
}else{
    console.log("user cancelled the operation");

}

var userInput=prompt("please  enter your name");
console.log(userInput);


document.write("welcome to JS");//it will directly write messages on the page
































