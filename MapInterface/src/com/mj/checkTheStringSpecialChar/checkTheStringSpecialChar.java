package com.mj.checkTheStringSpecialChar;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class checkTheStringSpecialChar

{
	public static void main(String[] args) {
		
	
	String name= "Manoj@%KUNCH@L";
	
	Map<Character,Integer> map= new HashMap();
	for(int i=0; i<name.length();i++)
	{
		char ch=name.charAt(i);
		if(ch!=' ')
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
	}
	
	
	
	
	int Characters=0,SpecialChar=0;
	
	for(Entry<Character,Integer> entrySet:map.entrySet())
	{
		if(entrySet.getKey()>='a' && entrySet.getKey()<='z' ||
				entrySet.getKey()>='A' && entrySet.getKey()<='Z')
			Characters++;
		else
			SpecialChar++;
	}
	
	System.out.println("Character's :: "+Characters+"\n"
					 + "Special Cahraxter's :: "+SpecialChar); 
	
	
	}
}
