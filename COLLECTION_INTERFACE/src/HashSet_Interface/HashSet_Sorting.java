package HashSet_Interface;

import java.util.Arrays;
import java.util.HashSet;

public class HashSet_Sorting {

	public static void main(String[] args) 
	{
		Boolean [] bool = new Boolean[5];
		
		HashSet<Object> hs= new HashSet<>();
		
		 bool[0]=  hs.add(12);
	       bool[1]=  hs.add(new String("NIT"));
	       bool[2]=  hs.add(12);
	       bool[3]=  hs.add(new StringBuffer("Ampt"));
	       bool[4] = hs.add(new String("NIT"));
	       
	       System.out.println(Arrays.toString(bool));
	
		
		hs.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
//		 Boolean [] bool = new Boolean[5];	
//			
//	       HashSet<Object> hs = new HashSet<>();
//	       bool[0]=  hs.add(12);
//	       bool[1]=  hs.add(new String("NIT"));
//	       bool[2]=  hs.add(12);
//	       bool[3]=  hs.add(new StringBuffer("Ampt"));
//	       bool[4] = hs.add(new String("NIT"));
//	       
//	       System.out.println(Arrays.toString(bool));
//	       
//	       hs.forEach(System.out::println);

	}

}
