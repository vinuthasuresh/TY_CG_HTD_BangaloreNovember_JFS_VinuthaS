var date = new Date();
console.log(date.getDate());
console.log(date.getMonth());
console.log(date.getTime());
console.log(date.getDay());
console.log(date.getMinutes());

let myDateTag = document.getElementById('todaysDate');
setInterval(()=>{
    var date = new Date();
   myDateTag.innerHTML=`
   Date ::: ${date.getDate()}-${date.getMonth() +1}-${date.getFullYear()}
    Time ::: ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}`
    

},1);