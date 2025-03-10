package com.mj.checkTheString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ChecTheStringContainsDigids 
{
	
	
	public static String check(String name)
	{

		Map<Character, Integer> map= new HashMap();
		
		
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			
			if(ch!=' ') 
			
				if(map.containsKey(ch))
				
				
					map.put(ch, map.get(ch)+1);
				
				
				else
				
				
					map.put(ch, 1);
				
		
		}
		
		for(Entry<Character,Integer> entrySet:map.entrySet())
		{
			if(entrySet.getKey()>='1' && entrySet.getKey()<='9')
			{
				return "The String contains Didits";
			}
		}
		return "The String is not contains Digits";
			
		
		

		
		

	}
	
	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name=s.nextLine();
		
		System.out.println(check(name));

	}
}
   