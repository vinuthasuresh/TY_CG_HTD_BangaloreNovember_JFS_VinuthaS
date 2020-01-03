var person ={
    aadharNo: 12345678945
}
var personPan= {
    pan: 'DIGH89DD'
}
var student= {
    ...person,
    ...personPan,
    id: 1234,
    name: 'vinutha',
    degree: 'BE',
    phone: 8956232389,
    address: {
        city: 'bangalore',
        state: 'karnataka',
        pincode: 589623
    }

}
for(let key in student){
    console.log(key + ':::'+student[key]);
}
console.log(student.address.city);
console.log(student.name);
console.log(student['degree']);
console.log(student);
console.log(student.aadharNo);
console.log(student.pan);