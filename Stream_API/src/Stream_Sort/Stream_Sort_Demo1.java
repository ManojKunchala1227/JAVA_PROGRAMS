package Stream_Sort;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream_Sort_Demo1 {

	public static void main(String[] args) 
	{
		List <Integer> list= Arrays.asList(1,2,9,4,6,43,1,12,2,59,8,8);
		
		list.forEach(System.out::println);
		System.out.println("............................");
		
		
		list.stream().sorted().distinct().forEach(System.out::println);
		
		
		System.out.println("............................");
		
		Set<Integer> li=list.stream().sorted().collect(Collectors.toSet());
		li.forEach(System.out::println);
		
	}

}
