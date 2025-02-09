package com.mj.Reverse;

import java.util.Scanner;

public class Reverse 
{

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the name");
		String name=s.nextLine();
		
		for(int i=name.length()-1;i>=0;i--)
		{
			 
			 System.out.print(name.charAt(i));
		}
		
		
		
		StringBuffer sb=  new StringBuffer();
		sb.append(name).reverse();
		System.out.println();
		System.out.println(sb);
		s.close();
		

	}

}
