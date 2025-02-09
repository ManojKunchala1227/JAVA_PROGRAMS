package print_methods_in_collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class Fetch_Collection_obj_9ways {

	public static void main(String[] args) {
		
		Vector<String> v= new Vector<>();
		
		v.add("APPLE");
		v.add("MANGO");
		v.add("ORANGE");
		v.add("GREPES");
		
		
		//1
		System.out.println("Fetching elements by toString Method");
		System.out.println(v.toString());
		
		//2
		System.out.println("Fetching elements by for loop");
		for(int i=1;i>v.size();i++)
		{
			System.out.println(v.get(i));
			
		}
		
		
		//3
		System.out.println("Fetching elements by Method Reference");
		v.forEach(System.out::println);
		
		//4
		System.out.println("Fetching elements by forEach-consumer Method");		
		v.forEach(sum->System.out.println(sum));
		
		
		//5
		System.out.println("Fetching elements by Iterator");
		Iterator<String> it1=v.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
		
		//6
		System.out.println("Fetching elements by ListIterator");
		System.out.println("Fetching elements by hasNext()");
		ListIterator<String> listIt1=v.listIterator();
		
		while(listIt1.hasNext())
		{
			System.out.println(listIt1.next());
		}
		System.out.println("Fetching elements by hasPrevious()");
		while(listIt1.hasPrevious())
		{
			System.out.println(listIt1.previous());
		}
		
		
		//7
		System.out.println("Fetching elements by ListIterator");
		Spliterator<String> split1=v.spliterator();
		split1.forEachRemaining(fruit->System.out.println(fruit));
		
		
		//8
		System.out.println("Fetching elements by Enumeration");
		Enumeration<String> em1=v.elements();
		
		while(em1.hasMoreElements())
		{
			System.out.println(em1.nextElement());
		}
		
		
		
		
		
		
		
		//9 
		System.out.println("Fetching elements by ForEach Loop");
		
		for(String fr : v)
		{
			System.out.println(fr);
			
		}
		
			}

}
