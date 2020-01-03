

    function Palindrom (str) {
        return str == str.split('').reverse().join('');
      }
   
   console.log(Palindrom("malayalam"));


   function factorial(n){
       return   (n == 1 || n == 0) ? 1 : n *  factorial(n - 1); 

   }
   console.log(factorial(5));

 
   function primeNumber(n){
     return (n%2!=0);

         }
     

   
   console.log(primeNumber(3));

  var num;
  function pattern(){
       for( var i=1;i<=num;i++)
       {
           for(var j=1;j<=i;j++){
            console.log(j);
            console.log();
           }
        }
    }
   console.log(num);
   

   function fibbonacci(num){
       
   }