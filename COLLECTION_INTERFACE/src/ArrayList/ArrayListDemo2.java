package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args)
	{
		ArrayList<String> al= new ArrayList<>();
		
		al.add("Mango");
		al.add("Grapes");
		al.add("Guava");
		al.add("Banana");
		al.add("Apple");
		al.add("Mango");
		
		System.out.println("Contents :"+al);
		System.out.println("Size of the ArrayList: "+al.size());
		System.out.println("....................................");
		
		
		
		al.remove(0);
		al.remove("Banana");
		
		System.out.println("Contents After removing the elemens : "+al);
		System.out.println("Size of the ArrayList: "+al.size());
		System.out.println("....................................");
		
		
		
		Collections.sort(al);
		al.forEach(System.out::println);
		
		
		
		
		
		
		

	}

}


