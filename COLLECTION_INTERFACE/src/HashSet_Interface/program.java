package HashSet_Interface;

import java.util.HashSet;
import java.util.Scanner;

public class program {

	public static void main(String[] args) 
	{
		HashSet <String> hs= new HashSet<>();
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add Elements");
			System.out.println("2. Delete");
			System.out.println("3. Display");
			System.out.println("4. Exit");
			
			System.out.println("Enter your Choice: ");
			int choice=s.nextInt();
			
			switch(choice)
			{
			case 1: 
					System.out.println("Enter the emlement : ");
					String el=s.next();
					if(hs.add(el))
					{
						System.out.println("Element added Successfully...");
					}
					else
					{
						 System.out.println("Element already exists in the HashSet.");
					}
			
			break;
			
			
			case 2: 
					System.out.println("Enter the emlement to delete: ");
					String el1=s.next();
					
					if(hs.remove(el1))
							{
							System.out.println("Element Dleted Successfully...");
							}
					else
					{
						System.out.println("Element not found int the HashSet");
					}
//					hs.remove(el1);
					
			
			break;
			
			case 3: 
					System.out.println("Elements int the hashset: ");
					hs.forEach(System.out::println);		
					
			break;
			case 4: 
				System.out.println("Exiting the program");
				s.close();
				System.exit(0);
				
				default:
					System.out.println("Invalid choice please try again");
		}
			
		}
		

	}

}
