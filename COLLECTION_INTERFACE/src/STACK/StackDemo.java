package STACK;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) 
	{
		Stack <Integer> s= new Stack<>();
		
		try
		{
			s.push(12);
			s.push(23);
			s.push(13);
			s.push(19);
			
			System.out.println("After inserting elements:"+s);
			
			System.out.println("Fetching the Elements using pop method : ");
			System.out.println(s.pop());
			
			
			
			System.out.println("After deleting elements are : "+s);
			System.out.println("Is the Stack empty ?"+s.empty());
		}
		catch(EmptyStackException e)
		{
			e.printStackTrace();
			
		}
		
		
		
		
		

	}

}
