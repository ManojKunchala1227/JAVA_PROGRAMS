package com.mj.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee
{
	String name;
	String location;
	String designation;
	public Employee(String name, String location, String designation) {
	
		this.name = name;
		this.location = location;
		this.designation = designation;
	}
	
	
	
}
public class TestPredicateDemo2 
{
	public static void main(String[] args) {
		Employee emp1= new Employee("manoj","Hyd","java");
		Employee emp2= new Employee("Kiran","Hyd","sql");
		Employee emp3= new Employee("ashok","Kakinada","java");
		Employee emp4= new Employee("verendher","Chennai","python");
		Employee emp5= new Employee("jaya","bangulor","selenioum");
		
			List<Employee> emps= Arrays.asList(emp1,emp2,emp3,emp4,emp5);
			
			Predicate<Employee> predicate= pemp->pemp.location.equalsIgnoreCase("Hyd");
			Predicate<Employee> predicate1= pemp->pemp.designation.equals("java");
			Predicate<Employee> predicate2= pemp->pemp.name.startsWith("m");
			
			//Predicate<Employee> p= predicate.and(predicate1).and(predicate2);
			Predicate<Employee> p1= predicate.or(predicate1).or(predicate2);

			for(Employee emp:emps)
			{
				if(p1.test(emp))
				{
					System.out.println(emp.name);
					
				}
			}
	}
	
	
		
		
				

}
