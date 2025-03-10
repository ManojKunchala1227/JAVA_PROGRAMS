package com.mj.finall;

public class Test 
{
	public void m1(int a)
	{
		System.out.println(a);
	}
	public void m1(String name)
	{
		System.out.println(name);
	}
		
	
	
	public static void main(String[] args) 
	{
		Test t= new Test();
		t.m1(10);
		
	}
}
