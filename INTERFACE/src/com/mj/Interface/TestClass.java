package com.mj.Interface;

public class TestClass implements Test2, Test{

	@Override
	public void m1() 
	{
		System.out.println("In test class M1 Invoked");
		
	}
	@Override
	public void m2() {
		
		Test2.super.m2();
	}

	public static void main(String[] args) 
	{
		Test.m3();
		
		TestClass t= new TestClass();
		
		t.m1();
		t.m2();
		
	}
}
