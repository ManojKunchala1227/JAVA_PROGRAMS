package com.mj.finall;

public class TestOverden extends TestDemo
{

	@Override
	public void m1() {
		System.out.println("main");
	}
	public static void main(String[] args) 
	{
		TestDemo t= new TestDemo();
		t.m1();
		
	}

}
