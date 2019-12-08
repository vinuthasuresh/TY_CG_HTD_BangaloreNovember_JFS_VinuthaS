import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.add(10);
		v1.add(45);
		v1.add(67);
		v1.add(56);
		
		System.out.println(v1);//insertion order is preserved
		
		System.out.println(".......removeElement().........");
		v1.removeElement(new Integer(56));
		System.out.println(v1);
		
		System.out.println(".......set(index,value).........");

		v1.set(2, 80);
		System.out.println(v1);
		
		
	}

}
