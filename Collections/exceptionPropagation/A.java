package exceptionPropagation;

public class A {
	public static void main(String[] args) {
		System.out.println("main started");
		try{
			B.m();
			System.out.println("class found");
		}catch(ClassNotFoundException e) {
		System.out.println("class not found handled in A class");
	    }
	System.out.println("main ended");
}
	

}
