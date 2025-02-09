package Predicate;
import java.util.*;
import java.util.function.Predicate;
public class PredicateDemo 
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		
		//Verify number is even or odd
		
		Predicate<Integer> p1= num -> num%2==0;
		System.out.println("12 is Even ?:"+p1.test(12));
		
		System.out.println("12 is Even ?:"+p1.test(13));
		
		
		//Verify my name start with A or not
		
		Predicate<String> p2= str-> str.startsWith("A");
		System.out.println("Enter your Name: ");
		String name= s.nextLine();
		System.out.println(name+"  start with A?  "+p2.test(name));
		
		
		///Verify whether I am Manoj or Not
		
		Predicate<String> p3=str->str.equals("Manoj");
		
		System.out.println("Enter your name: ");
			name=s.nextLine();
			System.out.println("Are u manoj :" + p3.test(name));
		

	}

}
