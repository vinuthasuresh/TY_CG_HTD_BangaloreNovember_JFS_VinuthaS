import java.io.Serializable;

public class Person implements Serializable
{
	private int age;
	private String name;
	
	public Person(int age, String name)
	{
		this.name=name;
		this.age=age;
	}
	
	

	public Person() {
	}

	public int getAge()
	{
		return this.age;
	}
	public String getName()
	{
		return this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
