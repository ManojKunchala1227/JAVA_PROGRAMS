package com.mj.lambda;

public class CTest 
{
	public static void main(String[] args) {
		
		//IfunctionalInterface p=()-> System.out.println("m1 invoked"); p.m1();
		
		
//		IfunctionalInterface p=	(a,b)->
//		
//			System.out.println(a+b);
//		
//		p.m2(2, 5);
		
		
		IfunctionalInterface p=(a,b)-> System.out.println(a+b);
		
		p.m3(5, "manoj");
		
	}

}
