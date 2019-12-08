
public class Car1 extends Vehicle {
	
	int cost=60000;
	void carDetails()
	{
		int cost=10000;
		System.out.println("local variable cost value is "+cost);
		System.out.println("sub class variable cost value is "+this.cost);
		System.out.println("super class variable cost value is "+super.cost);
				
	}

}
