import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList <String>a1 = new ArrayList<String>();
		a1.add("Animal");
		a1.add("bird");
		a1.add("dog");
		
		ArrayList <String>a2 = new ArrayList<String>();
		a2.add("Animal");
		a2.add("cat");
		a2.add("crow");
		
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		a1.contains(a2);
		System.out.println(a1);
		 a1.add("peacock");
		 System.out.println(a1);
		 a1.remove(2);
		 System.out.println(a1);
		 a1.addAll(a2);
		 System.out.println(a1);
	}

}
