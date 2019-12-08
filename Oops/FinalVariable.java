
public class FinalVariable {
	
	final double PI;	
	public FinalVariable(double PI)
	{
		this.PI=PI;
	}
    public FinalVariable(int a, double PI)
    {
    	this.PI=PI;
    	
    }
    public FinalVariable(double d, double PI)
    {
    	this.PI=PI;                                                                 
    	
    }
    void FinalValue()
    {
    	System.out.println(PI);
    }
}
