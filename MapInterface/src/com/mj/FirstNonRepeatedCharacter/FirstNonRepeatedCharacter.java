package com.mj.FirstNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter 
{
	


	public static void main(String[] args) 
	{
		 
		
		String name= "Manojkunchala";
		//Approach -2
		
		
		//Map<Character,Integer> map= new HashMap();
		//	Map<Character,Integer> map= new Hashtable();
		Map<Character,Integer> map= new LinkedHashMap();
		
		
		for(int i=0;i<name.length();i++)
		{
			char ch= name.charAt(i);
			if(name.charAt(i)!=' ')
			{
				
			
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);	
			}
		}
	
		}
	//	System.out.println(map);
		
		for(Entry<Character, Integer> entrySet : map.entrySet())
		{
			
			if(entrySet.getValue()==1)
			{
				System.out.println("Approach-2");
				System.out.println(entrySet.getKey());
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
