package p2;
import java.util.*;
import p1.*;
public class Inheritance_2 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		C_Class ob= new C_Class ();
		System.out.println("Enter the vlue of z :");
		ob.z=Integer.parseInt(s.nextLine());
		System.out.println("Enter the name :");
		ob.name=s.nextLine();
		
		System.out.println("Enter the value of a :");
		int a= s.nextInt();
		System.out.println("Enter tha value of b :");
		int b =s.nextInt();
		
		int res= ob.claculate(a, b);
		System.out.println("The Results :"+res);
		
		
		
		
		
		ob.get();//
		
		
		s.close();
		
		
	}

}
