package com.mj.lambda;

import java.util.function.Predicate;

public class predicateDemo
{
	
	
	public static void main(String [] args)
	{
		//String array List 
		String[] names= {"Ajay", "Kiran","Avinash","Anand","Manoj"};
		
		//Using predicate
		Predicate<String> p= name-> name.charAt(0)=='A';
		
		
		for(String name:names)
		{
			if(p.test(name)) {
				System.out.println(name);
			}
		}
		
		
		
		System.out.println("===============================");
		
		
		//printing array list
		for(String name1:names)
		{
			System.out.println(name1);
		}
		
		
		
		
//		for (String name:names)
//		{
//			if(name.charAt(0)=='A')
//			{
//				System.out.println(name);
//			}
//		}

	}
	
	
}
