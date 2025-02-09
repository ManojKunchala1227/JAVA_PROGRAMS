package test;
 import java.util.*;
public class m {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner (System.in);
		
		b bo= new b();
		
		System.out.println("");
		bo.ob.name=s.nextLine();
		
		System.out.println("");
		bo.ob.age=s.nextInt();
		
		System.out.println("");
		bo.branch=s.nextLine();
		
		System.out.println("");
		bo.year=s.nextInt();
		
		s.close();
		
		
		
		bo.getbr();
		bo.ob.getdetails();

	}

}
