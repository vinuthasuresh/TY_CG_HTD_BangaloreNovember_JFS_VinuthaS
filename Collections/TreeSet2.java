import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<Student> t1 = new TreeSet<Student>();
		
		t1.add(new Student(20,"anu"));
		t1.add(new Student(50,"shree"));
		t1.add(new Student(10,"sam"));
		t1.add(new Student(20,"anu"));
		
		Iterator<Student> itr= t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
