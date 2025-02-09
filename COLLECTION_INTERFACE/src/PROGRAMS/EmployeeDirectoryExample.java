package PROGRAMS;

import java.util.Scanner;

public class EmployeeDirectoryExample 
{

	public static void main(String[] args)
	{
		Directory d= new Directory();
		Scanner s= new Scanner(System.in);
		
		while(true)
			{
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			
			int Choice = s.nextInt();
			
			switch(Choice)
			{
			case 1:
				d.addEmployee();
				break;
			case 2:
				d.addEmployee();
				break;
			case 3:
				d.addEmployee();
				break;
			case 4:
				d.addEmployee();
				break;
			}
			
			
				
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
