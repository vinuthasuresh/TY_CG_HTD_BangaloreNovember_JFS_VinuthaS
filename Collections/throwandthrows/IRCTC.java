package throwandthrows;

public class IRCTC 
{
	void confirmTicket() throws ClassNotFoundException
	{
	try {
		Class.forName("throwandthrows.Paytm");
		System.out.println("ticket confirmed");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("ticket is not confirmed");
		throw e;
	}
   
}
}
