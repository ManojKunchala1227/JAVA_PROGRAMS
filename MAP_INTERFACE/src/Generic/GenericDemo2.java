package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GenericDemo2 
{

	public static void main(String[] args) 
	{ 
		 
		List<Integer> myList = new ArrayList<>(); 

		myList.add(4); 
		myList.add(6); 
		UnknownClass u = new UnknownClass(); 
		int total = u.addValues(myList); 
		System.out.println(total); 
	} 
}  
class UnknownClass 
{ 
    public int addValues(List list)  
	{ 
		list.add(5);	//adding object to raw type
		Iterator it = list.iterator(); 
		int total = 0; 
		while (it.hasNext()) 
		{
		int i = ((Integer)it.next()); 
		total += i; 
		} 
		return total; 
	} 
} 
