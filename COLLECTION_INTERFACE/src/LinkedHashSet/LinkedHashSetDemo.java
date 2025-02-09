package LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs= new LinkedHashSet<>();
		lhs.add("Ravi");
		  lhs.add("Vijay");
		  lhs.add("Ravi");
		  lhs.add("Ajay");
		  lhs.add("Pawan");
		  lhs.add("Shiva");
		  lhs.add(null);
		  lhs.add("Ganesh");        
		  lhs.forEach(System.out::println);
		  
		  System.out.println(".................................");
		  
		  HashSet<String> hs= new HashSet<>();
			  hs.add("Ravi");
			  hs.add("Vijay");
			  hs.add("Ravi");
			  hs.add("Ajay");
			  hs.add("Pawan");
			  hs.add("Shiva");
			  hs.add(null);
			  hs.add("Ganesh");        
			  hs.forEach(System.out::println);
		  
		  

	}

}
