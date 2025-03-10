package com.mj.Interface;

public interface Test2 extends Test 
{
	@Override
	default void m1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	default void m2()
	{
		
		Test.super.m2();
	}
	

}
