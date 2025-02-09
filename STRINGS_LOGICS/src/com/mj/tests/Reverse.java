package com.mj.tests;

public class Reverse 
{
	
	
	
	
	
	public static void main(String args[])
	{
		String name= "manoj";
		
		
		char c= 'M';
		
		
		
		int position=c-'A'+1;
		
		
		System.out.println(position);
		
		System.out.println("================================================");
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			
			System.out.print(name.charAt(i));
			System.out.println("  ");
			
			
			
			
		}
		System.out.println("================================================");
		
		StringBuffer b= new StringBuffer(name);
		System.out.print(b.reverse());
		
		
		
		
		
		
		
		
		
	}

}
