package com.mj.palidrom;

public class palidrom {

	public static void main(String[] args) 
	{
		String name="maem";
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c=name.charAt(i);
			
			rev=rev+c;
			
			
		}
		if(name.equalsIgnoreCase(rev))
		{
			System.out.println("Yes it's Palidrom");
		}
		else
		{
			System.out.println("It's not Palidrom");
		}

	}

}
