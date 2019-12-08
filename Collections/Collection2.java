import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main(String[] args) {
		Collection c1= new ArrayList();
		
		c1.add("Sheldon");
		System.out.println(c1);
	
		
		System.out.println(c1.remove(c1));
		System.out.println(c1.size());
		c1.add("james");
		System.out.println(c1.contains("james"));
	}

}
