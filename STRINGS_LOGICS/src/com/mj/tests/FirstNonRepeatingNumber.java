package com.mj.tests;

import java.util.Scanner;

public class FirstNonRepeatingNumber 
{
	
	
	public static String firstNonRepeatingNumber(String str)
	{
		String result= "";
		
		for(int i=0;i<str.length();i++)
		{
			int count =0;
			
			if(str.charAt(i)!=' ')
			{
				for(int j=0;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j) && i!=j)
					{
						count ++;
						break;
					}
				}
				
				if(count ==0)
				{
					result +=str.charAt(i);
					break;
				}
				
			}
			
			
			
		}
		
		
		
		
		
		return result;
	}
	
	
	
	
	
	
	
	
	public static String lastNonRepeatingNumber(String str)
	{
		String result= "";
		
		for(int i=str.length()-1;i>0;i--)
		{
			int count =0;
			
			if(str.charAt(i)!=' ')
			{
				for(int j=0;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j) && i!=j)
					{
						count ++;
						break;
					}
				}
				
				if(count ==0)
				{
					result +=str.charAt(i);
					break;
				}
				
			}
			
			
			
		}
		
		
		
		
		
		return result;
		
	}
	
	
	
	
	public static void main(String agrs[])
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println(" Enter the String :: ");
		String str=s.nextLine();
		
		//System.out.println("FIRST NON Answer is::"+firstNonRepeatingNumber(str));
		System.out.println("LAST NON Answer is::"+lastNonRepeatingNumber(str));
		
		
	}

}
