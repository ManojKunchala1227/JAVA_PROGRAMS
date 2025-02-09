package STREAM_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_API_Demo2 {

	public static void main(String[] args) 
	{
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,3,7,2,8,1);
		
		
		ArrayList<Integer> even= new ArrayList<>();
		
		for(Integer i: list)
		{
			if(i%2==0)
			{
				System.out.println(even.add(i));
			}
			
		}
		even.forEach(System.out::println);
		System.out.println("..............................");
		
		System.out.println("Even numbers in Stream ");
		
		list.stream().filter(num-> num%2==0).forEach(System.out::println);
		
		
		
		
		System.out.println("Odd numbers in Stream: ");
		list.stream().filter(num -> num%2==1).forEach(System.out::println);
		
		System.out.println("...................................");
		
		System.out.println("Printing Even numbers in Set : ");
		Set<Integer> st=list.stream().filter(num-> num%2==0).collect(Collectors.toSet());
		st.forEach(System.out::println);
		
		
		
		
		System.out.println("Printing Odd numbers in List : ");
		List<Integer> li= list.stream().filter(num-> num%2==1).collect(Collectors.toList());
		li.forEach(System.out::println);
		
		
		
		
		
		
	
		
		
		
	}

}

