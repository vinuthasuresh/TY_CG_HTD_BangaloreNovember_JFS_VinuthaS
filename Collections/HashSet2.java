import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<Student> h1 = new HashSet<Student>();
		h1.add(new Student(10,"Divya"));
		h1.add(new Student(20,"anu"));
		h1.add(new Student(30,"ramesh"));
		h1.add(new Student(10,"Divya"));
		
		for(Student s1:h1)
		{
			System.out.println("age is "+s1.studAge+ " name is "+s1.studName);
		}
		
	}

}
