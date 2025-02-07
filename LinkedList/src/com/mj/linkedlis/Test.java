package com.mj.linkedlis;

import java.util.Iterator;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) 
	{
		LinkedList<Dog> lk= new LinkedList<>();
		
		Dog d= new Dog("potti");
		
		lk.add(d);
		lk.add(new Dog("Tiger"));
		lk.add(new Dog("Lion"));
		lk.add(new Dog("Cheeta"));
		
		
		Iterator<Dog> it= lk.iterator();
		it.forEachRemaining(x->
		System.out.println(x.getName().toUpperCase()));
		
		
		System.out.println(lk.size());
		
		System.out.println(lk.get(1).getName());
		
		
		
		// System.out.println(d);

	}

}
