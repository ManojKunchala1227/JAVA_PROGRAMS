package com.mj.polymorphism;

public class Overloading 
{
	
	
	

	public Overloading(int x, int y)
	{
		super();
		
		System.out.println(x+" "+y);
		
	}
	public Overloading(int x, int y, int z)
	{
		this(100,200);
		
		System.out.println(x+" "+y+" "+z);
		
	}
	
	public Overloading(float x, float y)
	{
		this(10,20,30);
		
		
		System.out.println(x+" "+y);
		
	}

	public static void main(String[] args) 
	{
		new Overloading(2.3f,7.8f);
		

	}

}
