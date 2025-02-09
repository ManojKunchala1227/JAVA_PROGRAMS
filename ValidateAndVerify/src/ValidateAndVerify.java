import java.util.*;
public class ValidateAndVerify extends Exception {
	
	public ValidateAndVerify (String msg)
	{
		super(msg);
	}
	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Enter  the CoreJava Marks :");
			int cjava=s.nextInt();
			if(cjava>100 || cjava<0) 
			{
				ValidateAndVerify ob = new ValidateAndVerify("Invalid Marks");
				throw ob;
				
			}
			System.out.println("Marks of CareJava......."+cjava);
			
		}  //try block End 
		catch( ValidateAndVerify ob)
		{
			System.out.println(ob.getMessage());
			
		} //catch block End
		finally 
		{
			s.close();
			
		} //finally block End
		

	}

}

