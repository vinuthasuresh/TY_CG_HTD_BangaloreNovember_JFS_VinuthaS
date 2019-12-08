import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();

		t1.add(20);
		t1.add(87);
		t1.add(10);
		t1.add(50);
		t1.add(20);
		//t1.add(null);//gets NullPointerException
		//	t1.add("john");//gets ClassCastException
		

		t1.remove(20);

		for (Object o1:t1)
		{
			System.out.println(o1);
		}
	}

}
