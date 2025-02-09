package LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(5);
        lhs.add(15);
        lhs.add(20);
        lhs.add(5); 
        
        System.out.println("LinkedHashSet elements: "+lhs);
        
        int elements=15;
        if(lhs.contains(elements))
        {
        	System.out.println(elements+" is present in the LinkedHashSet");
        	
        }
        else
        {
        	System.out.println(elements+" is not  present in the LinkedHashSet");
        	
        	
        }
        
        
        int elem=10;
        if(lhs.remove(elem))
        {
        	System.out.println(elem+" is removed in the LinkedHashSet");
        	
        	 System.out.println("After removing the LinkedHashSet elements: "+lhs);
        	
        }
        else
        {
        	System.out.println(elements+" is not  present in the LinkedHashSet");
        	
        	
        }
        lhs.clear();
        System.out.println("After clearing LinkedHashSet elements: "+lhs);
	}

}
