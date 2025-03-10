package com.mj.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


class person
{
	String name;
	int age;
	
	public person(String name, int age) {
		
		this.name=name;
		this.age=age;
	}
}



public class TestPredicateDemo1
{
	
	public static void main(String[] args) 
	{
		person p= new person("manoj",15);
		person p1= new person("vijay",28);
		person p2= new person("prashanth",30);
		person p3= new person("vikram",23);
		person p4= new person("kiran",38);
		
		List<person> plist= Arrays.asList(p,p1,p2,p3,p4);
		Predicate<person> predicate=pp->pp.age>=10;
		
		for(person per:plist)
		{
			//System.out.println(per);
			
			if(predicate.test(per))
			{
				System.out.println(per.name);
			}
		}
		
	}
	
	
	
	
	
	
}
