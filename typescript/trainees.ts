interface Traniee{
    name: string,
    age: number,
    printData(): void
}
class Training implements Traniee{
    name='abc';
    age=21;
    printData(){
        console.log("helllo")
    }
}
let tranie1: Traniee={
    name:'kelvin',
    age:33,
    printData: function(){
        console.log(this.name,this.age);
    }
    
}