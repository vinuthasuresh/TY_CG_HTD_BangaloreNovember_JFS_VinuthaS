let marks=[12,45,56,94,9,100,78,90];
let ascendingorder=marks.sort((a,b)=> {
    return a-b;//sorts in ascending order
});

console.log('in ascending order',ascendingorder );

let descendingorder =marks.sort((a,b)=>{
    return b-a;
});
console.log('in descending order', descendingorder);

let message="good morning folks";
console.log(message.charCodeAt(3));//returns ascii value of a character
console.log(message.charAt(2));//returns the character at the given index

//split method

let splittedMessage = message.split('').reverse().join('');//to reverese a string
console.log(splittedMessage);

console.log(message.includes('foks'));//returns boolean

console.log(message.toUpperCase());
console.log(message.toLowerCase());

console.log(message.substr(0, 10));
console.log(message.length);//to find length of the String

//using rest parameter
function add(...nums){
    let sum=0;
    for(let num of nums){
        sum=sum+num;
    }
    console.log("sum of numbers is",sum);
}

add(2,4,9);

//destructuring
let student= {
    id: 2312,
    name: 'vinutha',
    age: 23
};
let{ name, id, ...theRest} = student;
console.log(name);
console.log(id);
console.log(theRest);

//array destructuring
let Mark = [10,29,56,78,80];
let [maths, socialSci, English, kannada, ...rest] = Mark;
console.log('math marks is',maths);
console.log('socialsci marks is',English);
console.log('kannada marks is', kannada);
console.log('rest of the marks is', rest);




















