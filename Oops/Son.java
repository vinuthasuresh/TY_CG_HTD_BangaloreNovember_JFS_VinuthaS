
public class Son extends Father 
{
   Son()
   {    super("sam",59);
	   System.out.println("C");
   }
   Son(String name, int age)
   {   this();
	   System.out.println("D");
   }
}
