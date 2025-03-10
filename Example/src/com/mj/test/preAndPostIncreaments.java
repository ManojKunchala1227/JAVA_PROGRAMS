package com.mj.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class preAndPostIncreaments 
{
	public static void main(String[] args)
	{
		
		
//		int x=10;
//		int y=5;
//		      //11 + 4*2 =19
//		int z=x++ + --y*2;
//		
//		
//									
//		System.out.println("x ::"+x +"\n" //11
//						  +"y ::"+y +"\n" //4
//						  +"z ::"+z +"\n"); //19
		
		//The code you're sharing has an issue because Arrays.asList() returns a
		//fixed-size list, which doesn't support the add() operation. Specifically, the list returned by 
		//Arrays.asList() is backed by the array you pass to it, so you cannot modify the size of the list by adding or 
		//removing elements.
		
		
		List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3));
		
		Stream<Integer> stream=list.stream();
		
		list.add(4);
		stream.forEach(System.out::println);
		

		
		
		
	}

}
