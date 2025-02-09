package test;

public class NestedTryBlock 
{
	public static void main (String args[])
	{
		try
		{
			String x="Manoj";
			System.out.println("Length of the String ::"+x.length());
			try 
			{
				String y="NIT";
				int z=Integer.parseInt(y);
				//int z= 5;
				
				System.out.println("Z value ::"+z);
				
			}
			catch(NullPointerException e)
			{
				
				System.out.println("Number not in proper format");
				
			}
			
		}// Outer try
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer Exception");
			
		}//Outer try
		
		
	}

}
