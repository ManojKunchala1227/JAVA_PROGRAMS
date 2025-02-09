package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		List<Object> list = new LinkedList<>();
		list.add("manoj");
		list.add("Vijay");
		list.add(12);
		list.add("mano");
		list.add(null);
		
		
		System.out.println("1st Position of the Element : "+list.get(1));
		
		//Iterator
		
		Iterator<Object> it= list.iterator();
		it.forEachRemaining(System.out::println);
		
		

	}

}

