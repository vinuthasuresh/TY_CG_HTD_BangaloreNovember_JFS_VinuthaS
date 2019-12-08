import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		
		EmployeeName e1 = new EmployeeName();
		EmployeeAge e2 = new EmployeeAge();
		EmployeeSal e3= new EmployeeSal();
		TreeSet<Employee> t1 = new TreeSet<Employee>(e3);
		
		t1.add(new Employee(30,20000.0,"shree"));
		t1.add(new Employee(20,60000.0,"sam"));
		t1.add(new Employee(10,50000.0,"ankit"));
		
		for (Employee emp:t1)
		{
			System.out.println("employee age is "+emp.age);
			System.out.println("employee name is "+emp.name);
			System.out.println("employee sal is "+emp.sal);
		}
		
	}
}
