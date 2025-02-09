package com.mj.tests;

import java.util.Scanner;

public class NumberOfOccurences {
	
	
	
	public static String countCharecterOccurences(String str)
	{
		
		String s="";
		char arr[]= new char[str.length()];
		int c=0;
		
		for(int i=0;i<str.length();i++)
		{
			
			System.out.println("Going Charecter ::"+str.charAt(i));
			System.out.println("=====================================================");
			System.out.println("=====================================================");
			
			int count =1;
			if(str.charAt(i) !=' ')
			{
				for(int j=i+1;j<str.length();j++)
				{
					System.out.println(str.charAt(i)+"::  Checking   ::"+str.charAt(j));
					
					System.out.println("=====================================================");
					
					
					if(str.charAt(i)==str.charAt(j) && i!=j)
					{
						
						count++;
						
System.out.println("Checking  " +str.charAt(i)+"=="+str.charAt(j));
						
						System.out.println("=====================================================");
						System.out.println("=====================================================");
						
						
					}
				}
				
				
				if(count==1)
				{
					
					arr[c++]=str.charAt(i);
					
					System.out.println(arr);
					System.out.println("=====================================================");
					System.out.println("=====================================================");
					System.out.println("=====================================================");
					
					
				}
				
				
				
				
			}
		}
		
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("Going Char  is::"+arr[i]);
			System.out.println("=====================================================");
			System.out.println("=====================================================");
			
		int count2=1;
		if(arr[i]>='a' &&arr[i]<='z' || arr[i]>='A' &&arr[i]<='Z')
		{
			
			
			for(int j=0;j<str.length();j++)
			{
				if(arr[i]==str.charAt(j) )
				{
					
					
					count2++;
					System.out.println(arr[i]+"  ==  "+str.charAt(j));
					System.out.println("=====================================================");
					System.out.println("=====================================================");
					
				}
				
			}
			
			s +=arr[i] + " : " +count2+"\n";
			
		}
		
			
		}
		return s;
		
		
	}

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter String :: ");
		String str=s.nextLine();
		
		System.out.print(countCharecterOccurences(str));
		
		s.close();
		
		
		/*
		 * String name="Software Service";
		 * 
		 * int total_count=name.length(); System.out.println("Total count Of String = "
		 * +total_count);
		 * 
		 * 
		 * int totalCount_AfterRemove =name.replace("a", "").length();
		 * System.out.println("Total count Of String = "+totalCount_AfterRemove);
		 * 
		 * int A_count= total_count-totalCount_AfterRemove;
		 * System.out.println("Count of A ::"+A_count);
		 */
		
		
	
		
		}

}
