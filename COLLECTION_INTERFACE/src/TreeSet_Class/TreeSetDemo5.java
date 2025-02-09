package TreeSet_Class;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo5 {

	public static void main(String[] args) 
	{
		SortedSet<String> ss = new TreeSet<>();
		ss.add("Mango");
		ss.add("Orange");
		
		TreeSet<String> ts1 = new TreeSet<>(ss);
		ts1.add("Apple");
		ts1.add("Kiwi");
		
		System.out.println(ts1);

	}

}
