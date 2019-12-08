import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	public static void main(String[] args) {
		Collection c1= new ArrayList();
		
		//adding an element inside the collection
		c1.add(12);
		System.out.println(c1);
		
		//removing of an element from a collection
		c1.remove(12);
		System.out.println(c1);
		
		//finding size of a collection
		
		System.out.println(c1.size());
		
		//checking collection is empty or not
		System.out.println(c1.isEmpty());
		
		//checking whether 12 object is there or not inside a collection
		c1.add(10);
		System.out.println(c1.contains(10));
		
	}

}
