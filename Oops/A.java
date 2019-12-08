
abstract public class A {
		int a;
		static double d;
		
		abstract void sum(int a, int b);
		 void multiply(int a)
		 {
			 System.out.println(a*a);
		 }
		 
		 static {
			 d=10.11;
			 System.out.println("in static block");
		 }
		 
		 A(int a)
		 {
			 this.a=a;
		 }
		 
		 {
			 a=10;
			 System.out.println("in non static block");
		 }
		 
		
		

}
