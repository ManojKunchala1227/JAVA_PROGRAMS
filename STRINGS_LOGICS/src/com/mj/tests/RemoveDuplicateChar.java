package com.mj.tests;

import java.util.Scanner;

public class RemoveDuplicateChar 
{
	public static String removeDuplicateChar(String str)
	{
		String result="";
		
		
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			
			if(str.charAt(i)!=' ')
			{
				for(int j=i+1;j<str.length();j++)
				{
					
					
					if(str.charAt(i)==str.charAt(j) && (i!=j)) 
					{
						count++;	
						
						
					}
				}
				if(count==0)
				{
					result +=str.charAt(i);
				}
			}
		}
		
		
		
		
		return result;
	}

	public static void main(String[] args) 
	{
		
		Scanner s= new Scanner(System.in);
	
		System.out.println("Enter the String ::");
		String str=s.nextLine();
		
		System.out.println("Amswer is ::" +removeDuplicateChar(str));

		s.close();
	}

}
