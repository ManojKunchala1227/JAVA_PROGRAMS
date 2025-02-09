package ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ImmutableList 
	{

		public static void main(String[] args) 
		{
			List<String> l= Arrays.asList("Rohit","manoj","krishna","Eeshwar");
			
			
			
			//Fetching the data in both the directions
			
			ListIterator<String> li=l.listIterator();
			
			System.out.println("In Forward Direction...: ");
			
			while(li.hasNext())
			{
				System.out.println(li.next());
				
			}
			
			
			
			
			System.out.println("Backward Direction");
			while(li.hasPrevious())
			{
				System.out.println(li.previous());
			}
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
			
			
		}


}
