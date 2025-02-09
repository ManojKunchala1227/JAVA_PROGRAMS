package TreeSet_Class;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) 
	{
		TreeSet<String> t1 = new TreeSet<>();
		t1.add("Orange"); 
		t1.add("Mango");
		t1.add("Pear");
		t1.add("Banana");
		t1.add("Apple");	
		System.out.println("In Ascending order");
		t1.forEach(i -> System.out.println(i));

		TreeSet<String> t2 = new TreeSet<>();
		t2.add("Orange");
		t2.add("Mango");
		t2.add("Pear");
		t2.add("Banana");
		t2.add("Apple");
		
		
		System.out.println("Descending Order");
		Iterator<String> t= t1.descendingIterator();
		t.forEachRemaining(System.out::println);
	

	}

}
