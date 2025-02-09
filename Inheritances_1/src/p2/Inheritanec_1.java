package p2;
import java.util.*;
import p1.*;


public class Inheritanec_1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		B ob =new B();//Child Class object
		
		System.out.println("Enter the value of a :");
		
		ob.a=Integer.parseInt(s.nextLine());
		System.out.println("Enter the name : ");
		ob.name=s.nextLine();
		
		System.out.println("Enter the values of b :");
		ob.b=Integer.parseInt(s.nextLine());
		System.out.println("Enter the name2 : ");
		ob.name2=s.nextLine();
		
		
		ob.get2();
		ob.get();
		
		s.close();
	}

}
