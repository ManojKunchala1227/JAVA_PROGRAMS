package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		ArrayList<String> al= new ArrayList<>();
		
			al.add("Orange");
			al.add("Mango");
			al.add("Grapes");
			al.add("Guava");
			
			
			Collections.sort(al);
			
			System.out.println("Ascending Order");
			System.out.println(al);
			
			
			
			Collections.reverse(al);
			System.out.println("Reverse Order");
			System.out.println(al);
			
			
			
			System.out.println("............................................");
			System.out.println(al);
			

			
			
			
			

	}

}
