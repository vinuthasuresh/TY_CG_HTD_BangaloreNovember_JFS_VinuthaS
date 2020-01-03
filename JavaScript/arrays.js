var technologies = ['java','phyton','hibernate','angular','jdbc',1256, true,null];

//sconsole.log(technologies[4]);


// for (let technology of technologies) {
//     console.log(technology);
// }

// for(let index in technologies){
//     console.log('index is'+index+'value is'+technologies[index]);
// }
 
technologies.forEach((value, index)=>{
    console.log(value);
    console.log(index);
});

console.log("index of angular is ",technologies.indexOf('angular'));

console.log('before pop', technologies);
console.log(technologies.pop());
console.log("after pop",technologies);

console.log("before push", technologies);
console.log(technologies.push('springboot'));
console.log("afetr push "+technologies);

console.log("before shift",technologies);
console.log(technologies.shift());
//returns value in the index 0 and removes it
console.log("after shift" ,technologies);

console.log(technologies.unshift('HTML','CSS'));
//adds the element in index 0 and returns length

console.log("after unshift", technologies);

technologies.splice(2,0,'Bootstrap','javascript','java');
console.log('splice applied to add few elements', technologies);

technologies.splice(technologies.indexOf(1256),2);
console.log("after deleting unwanted elements",technologies);

//to find length of array
console.log(technologies.length)

//to reverse the array
technologies.reverse();

console.log('reversed array', technologies);

//filetering array for marks greater than 40
let marks=[13,34,37,68,87,90];
let filteredArray=marks.filter((value,index,Array)=>{
    return value>40;
});
//no of people having marks greater than 40
console.log(filteredArray.length);

//fileteing to unique values
var unimarks=[20,20,20,40,40,50,60];
var uniqueMarks=unimarks.filter((value,index,Array)=>{
   return Array.indexOf(value)===index;
});
console.log(uniqueMarks);

let myArray= marks.map((value,index,Array)=>{

return{ind: index, val: value};
});

console.log(myArray);

























