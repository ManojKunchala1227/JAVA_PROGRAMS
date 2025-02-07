package Example;

public class test1 
{
	public  static void me()
	{
		try
		{
			int a=15;
			int b=0;
			int c=a/b;
			
			
			System.out.println("C value is :: "+c);
			
		}
		catch( Exception e)
		{
			e.printStackTrace();
			
		}

		
	}
	
	public static void main(String args[])
	{
		
		test1.me();
		
		
	}
	
}
