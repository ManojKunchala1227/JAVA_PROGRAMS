package com.mj.lambda;
@FunctionalInterface
interface Test
{
	public void m1();
}

public class Check 
{
	
	public static void main(String[] args)
	{
		
		Test t=()->
		
			System.out.println("m1 Invoked");
			
		
		
		t.m1();
		
	}

}
