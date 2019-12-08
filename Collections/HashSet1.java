import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(23);
		hs.add(86);
		hs.add(12);
		hs.add(44);
		hs.add(23);
		hs.add(null);
		hs.add(null);
		System.out.println("...........Iteration.........");
		for(Object object :hs)
		{
			System.out.println(object);
		
		}
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Vinutha");
		hs1.add("Bhavana");
		hs1.add("Sharanya");
		hs1.add("megha");
		hs1.add(null);
		System.out.println(hs1);
		for(String s :hs1)
		{
			System.out.println(s);
		
		}
		
	} 

}
