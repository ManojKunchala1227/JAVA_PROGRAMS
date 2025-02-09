package test;
import java.util.*;
public class even {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number :");
		int n=s.nextInt();
		
		if(n%2==0)
		{
			System.out.println("Enven number");
		}
		else {
			System.out.println("odd number");
			
		}
		s.close();

	}

}
