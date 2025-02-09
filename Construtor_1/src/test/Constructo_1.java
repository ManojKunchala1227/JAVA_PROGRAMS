package test;
import java.util.*;
public class Constructo_1 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the name: " );
		String nm=s.nextLine();
		System.out.println("Enter the fname: ");
		String fnm=s.nextLine();
		
		System.out.println("Enter the city: ");
		String cty= s.nextLine();
		
		System.out.println("Enter the state: ");
		String st= s.nextLine();
		
		System.out.println("Enter the Mid:  ");
		String md= s.nextLine();
		
		System.out.println("Enter the Pword: ");
		int pw= s.nextInt();
		
		System.out.println("Enter the phNo: ");
		int pNo= s.nextInt();
		
		
		Constructor cs= new Constructor(nm,fnm,cty,st,md,pw,pNo);
		
		cs.getDetails();
	}

}
