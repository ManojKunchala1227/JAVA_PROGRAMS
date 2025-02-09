package com.mj.polymorphism;

public class Static_or_CompileTime_Polymorphism 
{
	
		String a;
		String b;
		String c;
		
		//Overloading COncept
		public void name(String a, String b, String c)
		{
			System.out.println(a+" "+b+" "+c+" ");
		}
		public void name(String a, String b) 
		{
			System.out.println(a+" "+b);
		}
	

	public static void main(String[] args) 
	{
		
		new Static_or_CompileTime_Polymorphism().name("Manoj", "Kunchala","b. Tech");

	}

}
