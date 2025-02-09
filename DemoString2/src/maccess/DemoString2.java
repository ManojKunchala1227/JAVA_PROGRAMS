package maccess;
import java.util.*;
public class DemoString2 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		try(s;)
		{
			System.out.println("Enter the String-1");
			String s1 =s.nextLine();
			
			System.out.println("Enter the String-2");
			String s2 =s.nextLine();
			
			System.out.println("Enter the String-3");
			String s3 =s.nextLine();
			
			System.out.println("=====+ symbol=====");
			String s4=s1+" "+s2+" "+s3;
			System.out.println("data in s4 :" +s4.toString());
			
			System.out.println("=====concat=====");
			String s5=s1.concat(" "+s2);
			System.out.println("Data in s5 :" +s5.toString());
			
			String s6=s1.concat(" "+s2).concat(" "+s3);
			System.out.println("Data in s6 :"+s6.toString());
			
			
		}//End of try with resource
		
		
	}

}
