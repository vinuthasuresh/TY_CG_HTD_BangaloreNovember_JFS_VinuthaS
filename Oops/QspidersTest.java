package oopsConcept;

public class QspidersTest 
{
	public static void main(String[] args)
	{
		Qspiders Hebbal = new Qspiders();
		Hebbal.swipe();
		Hebbal.swipe();
		
		Qspiders BTR = new Qspiders();
		BTR.swipe();
		
		System.out.println(Hebbal.branchStudCount);
		System.out.println(BTR.branchStudCount);
		System.out.println(Qspiders.totalStudCount);
		
		
	}

}
