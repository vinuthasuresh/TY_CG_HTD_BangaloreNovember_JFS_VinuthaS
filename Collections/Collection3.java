import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add(10);
		c1.add(20);
		c1.add(30);
		c1.add(65);
		
		Collection c2 = new ArrayList();
		c2.add(45);
		c2.add(56);
		c2.add(65);
		
		
		c1.addAll(c2);
		
		System.out.println(c1);
		c1.removeAll(c2);
		System.out.println(c1);
		
		System.out.println(c1.containsAll(c2));
		
		Collection c3= new ArrayList();
		c3.add(11);
		c3.add(22);
		c3.add(33);
		
		Collection c4= new ArrayList();
		c4.add(44);
		c4.add(33);
		c4.add(10);


		c3.retainAll(c4);
		System.out.println(c3);//gets only values present in both the collection
		
		
		System.out.println(c3);
		c3.clear();
		System.out.println(c3);
		System.out.println("..................................");
		Collection c5= new ArrayList();
		c5.add(55);
		c5.add(67);
		Object o1[]=c5.toArray();
		for(int i=0;i<o1.length;i++) {
		System.out.println(o1[i]);
		}
		
	}

}
