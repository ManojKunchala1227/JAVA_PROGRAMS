package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourse {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		try(s)
		{
			System.out.println("Enter the age:: ");
			Integer ag=s.nextInt();
			
			System.out.println("Your Age is:: "+ag);
			
		}
		catch(InputMismatchException e)
		{
			
		System.out.println(" InputMismatch Exception ");
			
		}
		
		System.out.println(" Reached Distination");

	}

}
