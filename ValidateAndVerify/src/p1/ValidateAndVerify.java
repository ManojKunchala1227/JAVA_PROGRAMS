package p1;
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
//			int cjava=s.nextInt();
			
			
			int cjava=Integer.parseInt(s.nextLine());
			if(cjava>100 || cjava<0) 
			{
				ValidateAndVerify ob = new ValidateAndVerify("Invalid Marks");
				throw ob;
				
			}
			else
			{
				System.out.println("Valid Marks for CoreJava......");
			}
			
			System.out.println("Marks of CareJava....... : "+cjava);
			
		}  //try block End 
		
		catch (NumberFormatException jbr)
		{
			System.out.println("Enter only Integer value....");
			System.out.println(jbr.getMessage());
			System.out.println(jbr.toString());
			jbr.printStackTrace();
			
		}
		
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

