package VECTOR;

import java.util.Scanner;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) 
	{
		Vector<String> v= new Vector<>();
		
		
		Scanner s= new Scanner(System.in);
		int Choice;
		
		do
		{
			System.out.println("To do List Of Menu");
			System.out.println("1. Add Task");
			System.out.println("2. View Task");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Exit");
			
			Choice=s.nextInt();
			s.nextLine();
			
			switch(Choice)
			{
			case 1: 
					System.out.println("Enter the Task Description");
					String task= s.nextLine();
					v.add(task);
					System.out.println("task added Successfully...........");
				break;
			case 2:
				System.out.println("View Task");
				
					
				/*"....................................................................."*/				
				
//				Iterator<String > t= v.iterator();
//				while(t.hasNext())
//				{
//					System.out.println(t.next());
//				}
//				
//				System.out.println(v);
//				
//				
//				for(int i=0;i<=v.size();i++)
//				{
//					System.out.println((i+1) +"." +v.get(i));
//				}
//				break;
				
				
				/*"....................................................................."*/
				
				for(int i=0;i<v.size();i++)
				{
					System.out.println((i+1)+". "+v.get(i));
					
				}
				
				break;
				
			case 3:
				System.out.println("Enter the Task number to mark as Completed");
				int ts=s.nextInt();
				
				if(ts>=1 && ts<=v.size())
				{
					
					System.out.println("Task mark as Completed :"+v.remove(ts-1)+"\n");


					
					
					/*String cm= v.remove(ts-1);
					System.out.println( "Task mark as Completed : "+cm+ "\n");*/
					
				}
				else
				{
					System.out.println("Invalid task Number");
				}
				break;
			case 4:
					System.out.println("Exiting ToDo List application. Goodbye!");
                break;
            default:
                	System.out.println("Invalid choice. Please enter a valid option.\n");
			}
			
			
		
		}
		while(Choice!=4);
		s.close();

	}

}
