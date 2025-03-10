package com.mj.lambda;
@FunctionalInterface
interface check1
{
	public void m1();
}
public class Test22
{
	
	public static void main(String[] args) {
		
		check1 c= ()->
		{
			System.out.println("manoj");
		};
		c.m1();
	}

}
