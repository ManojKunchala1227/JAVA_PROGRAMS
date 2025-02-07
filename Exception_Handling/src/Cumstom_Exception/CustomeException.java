package Cumstom_Exception;

public class CustomeException extends RuntimeException 
{
	public CustomeException(String msg)
	{
		super(msg);
		System.out.println(msg);
		
	}

}
