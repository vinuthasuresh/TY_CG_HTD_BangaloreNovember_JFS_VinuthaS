
public class Employee 
{
	String empName;
	int empAge;
	double empSalary;
	
	Employee(String name, int age, double salary)
	{
		empName=name;
		empAge=age;
		empSalary=salary;
	}
	void details()
	{
		System.out.println("Name is "+empName+" age is "+empAge+" Salary is"+empSalary);
	}

}
