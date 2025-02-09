package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Inside_Catch_Block {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		try(s)
		{
			System.out.println("enter the Roll no::");
			int ro=s.nextInt();
			System.out.println("Roll No is:::"+ro);
			
		}
		catch(InputMismatchException e)
		{
			try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("Divided b zero problem");
				
			}
			
		}

	}

}
