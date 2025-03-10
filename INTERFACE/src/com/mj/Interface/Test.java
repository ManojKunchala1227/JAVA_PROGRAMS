package com.mj.Interface;

public interface Test 
{
	public void m1();
	
	default  void m2()
	{
		System.out.println("Test m2 Invoked");
	
	}
	
	static void m3()
	{
		System.out.println(" Test m3 invoked");
	}

}
