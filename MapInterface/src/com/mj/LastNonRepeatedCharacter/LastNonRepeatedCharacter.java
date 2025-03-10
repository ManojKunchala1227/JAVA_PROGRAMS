package com.mj.LastNonRepeatedCharacter;

import java.util.LinkedHashMap;
import java.util.Map;

public class LastNonRepeatedCharacter {

	public static void main(String[] args) 
	{
	
		
		String name="Software Service";
		
		
			
		
		 Map<Character,Integer> map= new LinkedHashMap();
				
				
				for(int i=0;i<name.length();i++)
				{
					char ch=name.charAt(i);
					
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
				//System.out.println(map);
				
				for(int i=name.length()-1;i>=0;i--)
				{
					
					char ch= name.charAt(i);
					
					if(map.get(ch)==1)
					{
						System.out.println(ch);
						break;
					}
				}
				

	}

}
