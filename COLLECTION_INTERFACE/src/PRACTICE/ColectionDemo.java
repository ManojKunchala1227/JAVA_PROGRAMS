package PRACTICE;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class ColectionDemo {

	public static void main(String[] args)
        {
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		//Collections.sort(fruits);
		
		
		
		System.out.println("FETCHING ELEMENTS USING TOSTRING");
		
		System.out.println(fruits.toString());
		
		
		
		System.out.println("FETCHING ELEMENTS USING ENUMERATION ");
		
		Enumeration<String> ele = fruits.elements();
        while(ele.hasMoreElements())
        {
        	System.out.println(ele.nextElement());
        }
		
        
        
        
        System.out.println("FETCHING ELEMENTS USING ORDINARY FOR LOOP");
        
        for(int i=0; i<fruits.size(); i++)
        {
        	System.out.println(fruits.get(i));
        }
        
        
        
        
        
        System.out.println("FETCHING ELEMENTS USING  FOR EACH LOOP");
        
        for(String fruit : fruits)
        {
        	System.out.println(fruit);
        }
        
        
        
        
        System.out.println("FETCHING ELEMENTS USING ITERATOR");
        
        Iterator<String> itr =  fruits.iterator();
        while(itr.hasNext())
        {
              System.out.println(itr.next());
        }
        
        

        System.out.println("FETCHING ELEMENTS USING LISTITERATOR");
        
        ListIterator<String> lstItr = fruits.listIterator();
        
        System.out.println("IN FORWARD DIRECTION :");
        
        while(lstItr.hasNext())
        {
        	System.out.println(lstItr.next());
        }
               
        System.out.println("IN BACKWARD DIRECTION :");
        
        while(lstItr.hasPrevious())
        {
        	System.out.println(lstItr.previous());
        }
        
        
        
        
        System.out.println("FETCHING ELEMENTS USING SPLITITERATOR");
        
        Spliterator<String> splitItr = fruits.spliterator();
        splitItr.forEachRemaining(fruit -> System.out.println(fruit));
        
        System.out.println("USING FOREACH METHOD :");
        fruits.forEach(fruit -> System.out.println(fruit.toUpperCase()));
        
        System.out.println("USING METHOD REFERENCE :");
        fruits.forEach(System.out::println);
        
        
	}

}