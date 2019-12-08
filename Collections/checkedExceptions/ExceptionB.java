package checkedExceptions;

public class ExceptionB {
	
	public static void main(String[] args) {
		System.out.println("main started");
		Student s1 = new Student();
		
		try {
			Object o1 = s1.clone();
			System.out.println("clone is found");
			Class c1 =Class.forName("checkedExceptions.Student");
			System.out.println("class found");
		}catch(CloneNotSupportedException e)
		{
			System.out.println("clone is not supported");
		}catch(ClassNotFoundException a) {
			System.out.println("class not found");
			
     	}
		System.out.println("main ended");

	}
	 
	
}