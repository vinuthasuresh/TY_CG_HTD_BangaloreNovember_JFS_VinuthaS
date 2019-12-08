package overloading;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator c1= new Calculator();
		int r1=c1.add(10);
		int r2=c1.add(23, 1996);
		double r3=c1.add(10.9);
		System.out.println("result 1 is "+r1);
		System.out.println("result 2 is "+r2);
		System.out.println("result 3 is "+r3);

        Calculator.multiply(10);
        Calculator.multiply(20, 60);
		
		
		
	}

}
