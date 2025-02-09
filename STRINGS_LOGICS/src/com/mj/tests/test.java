package com.mj.tests;

import java.util.Scanner;

public class test {

	public static String countCharecterOccurences(String str)
	{
		
		String s="";
		char arr[]= new char[str.length()];
		int c=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			System.out.println("Going Charecter ::"+str.charAt(i));
			
			int count =1;
			if(str.charAt(i) !=' ')
			{
				for(int j=i+1;j<str.length();j++)
				{
					
					
					
					if(str.charAt(i)==str.charAt(j) && i!=j)
					{
						
						count++;
						
						
					}
				}
				
				
				if(count==1)
				{
					
					arr[c++]=str.charAt(i);
					
					
					
				}
				
				
				
				
			}
		}
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			
		int count2=1;
		if(arr[i]>='a' &&arr[i]<='z' || arr[i]>='A' &&arr[i]<='Z')
		{
			
			
			for(int j=0;j<str.length();j++)
			{
				if(arr[i]==str.charAt(j) )
				{
					count2++;
					
				}
				
			}
			
			s +=arr[i] + "  " +count2;
			
		}
		
			
		}
		return s;
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
		
		System.out.println("Enter String :: ");
		String str=s.nextLine();
		
		System.out.println(countCharecterOccurences(str));
		
		s.close();

	}

}
