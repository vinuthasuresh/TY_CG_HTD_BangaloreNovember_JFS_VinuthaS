
public class InstanceBlock {
	
	final int MAXIMUM;
	final static double PI;
	
	 public InstanceBlock()
	{
		System.out.println("calling constructor");
		
	}
	 
	 public InstanceBlock(int a){
		 System.out.println("constructor overloded");
	 }
	 
	{
		
		System.out.println("in instance initializer block");
		this.MAXIMUM=400;
	}
    static {
    	System.out.println("static initializer block");
    	PI=3.142;
    }
}
