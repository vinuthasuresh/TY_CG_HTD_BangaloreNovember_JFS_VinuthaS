
//getting the current location
navigator.geolocation.getCurrentPosition(podition=>{
    console.log('latitude',position.coords.latitude);
    latitude=position.coords.latitude;
    console.log('longitude',position.coords.longitude);
    longitude=position.coords.longitude;

    
    
    
});

let heading=document.getElementById('heading');
heading.style.background='red';
heading.style.color="blue";

function accept(){
    document.getElementById('proposal').src= "https://cdn.pixabay.com/photo/2018/02/15/21/55/sunset-3156440__340.jpg"
}
function reject(){
    document.getElementById('proposal').src="https://cdn.pixabay.com/photo/2018/04/06/00/25/nature-3294681_960_720.jpg"
}
localStorage.setItem('class', 'capgemini bangalore');

sessionStorage.setItem('name', 'john');
