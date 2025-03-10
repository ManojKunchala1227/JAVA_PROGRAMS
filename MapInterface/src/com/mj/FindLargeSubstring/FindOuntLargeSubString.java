package com.mj.FindLargeSubstring;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindOuntLargeSubString {

	public static void main(String[] args) 
	{
		Set<Character> set= new LinkedHashSet();
		
		String name="bananaas";
		
		for(int i=0;i<name.length();i++)
		{
			char ch= name.charAt(i);
			if(ch!=' ')
			{
				set.add(ch);
				
			
			}
				
		}
		
		StringBuilder result= new StringBuilder();
		
		for(char c:set)
		{
			result.append(c);
		}
		System.out.println(result);
		
		set.forEach( c-> System.out.print(c.toString()));
		
		

	}

}
