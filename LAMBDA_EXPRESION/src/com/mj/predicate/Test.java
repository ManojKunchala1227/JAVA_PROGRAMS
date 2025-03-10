package com.mj.predicate;

import java.util.function.Predicate;

public class Test 
{
	public static void main(String[] args) {
		String nm="manoj";
		Predicate <String> p=name-> name.equalsIgnoreCase("manoj");
		
		System.out.println(p.test(nm));
		
		
//	Supplier<String> s=	()->
//		{
//			String name="";
//			for(int i=1; i<5;i++)
//			{
//				name= name+(int) (Math.random()*10);
//			}
//			return name;
//		};
//		System.out.println(s.get());
	}
	
	
	

}
