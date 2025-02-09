package p2;
import java.util.*;
import p1.*;
public class Inheritance_3 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		
		System.out.println("enter the value x :");
		CClass.x=Integer.parseInt(s.nextLine());
		System.out.println("Enter the value of y :");
		CClass.y=s.nextInt();
		
		CClass.dis();
		CClass.dis2();
		
		
		CClass ob = new CClass();
		
		System.out.println("****Object****");
		System.out.println("enter the value x :");
		ob.x=s.nextInt();
		System.out.println("Enter the value of y :");
		ob.y=s.nextInt();
		
		ob.dis();
		ob.dis2();
		
		s.close();

	}

}
 