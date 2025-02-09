package HashSet_Interface;

import java.util.Collections;
import java.util.HashSet;

public class HasSetInterfaceDemo {

	public static void main(String[] args) 
	
	{
		HashSet<Integer> hs= new HashSet<>();
		hs.add(81);
		hs.add(53);
		hs.add(64);
		hs.add(35);
		hs.add(65);
		hs.add(69);
		
		
		
		
		int c= 1;
		if(hs.contains(c))
		{
			System.out.println("element Available in the list:"+c);
		}
		else
		{
			System.out.println("element not  Available in the list:"+c);
		}
		
		hs.forEach(x-> System.out.println(x));
		System.out.println("..................................");
		
		HashSet<String> hs2= new HashSet<>();
		
		hs2.add("Ravi");
		hs2.add("Kiran");
		hs2.add("Praveen");
		hs2.add("Manoj");
		hs2.add("Ravi");
		hs2.add("Jayanth");
		
		
		
		
		hs2.forEach(str-> System.out.println(str));
		
		System.out.println("..................................");
		
		
		
		
		
		
		
		

	}

}
