import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(34);
		l1.add(56);
		l1.add(60);
		
		ListIterator lt= l1.listIterator();
		System.out.println("........iterator..........");
		while(lt.hasNext())
		{
			System.out.println(lt.next());
			
		}
		System.out.println("...for each loop...........");
		for(Object i1:l1)
		{
			System.out.println(i1);
		}
		System.out.println("........for loop..........");
		
		for(int i=0;i<l1.size();i++)
			System.out.println(l1.get(i));
		
		l1.add(10);
		System.out.println(l1);
		l1.remove(new Integer(10));
		System.out.println(l1);
		
		l1.add(null);
		System.out.println(l1);
		System.out.println(".................................");
		
		
	}

}
