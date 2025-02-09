package Comparable;

import java.util.ArrayList;
import java.util.Collections;


public class Comparable_Demo {

	public static void main(String[] args) 
	{
		ArrayList<Employee> al= new ArrayList<>();
		
		al.add(new Employee(444, "Virat"));
		 al.add(new Employee(111, "Zuber"));
		 al.add(new Employee(222, "Rohit"));
		 al.add(new Employee(333, "Aryan"));
		 
		 Collections.sort(al);
		 al.forEach(System.out::println);
	}
	
	
	

}



   