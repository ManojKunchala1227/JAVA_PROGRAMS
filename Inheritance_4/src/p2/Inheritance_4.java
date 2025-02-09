package p2;
import java.util.*;
import p1.*;
public class Inheritance_4 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of y :");
		CClass.y=s.nextInt();
		
		
		CClass ob =new CClass ();
		ob.m(123);
		
		
		
		
	
		s.close();
		

	}

}
