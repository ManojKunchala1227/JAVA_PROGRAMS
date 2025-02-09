package Stream_Sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Sort_Demo2 
{
	public static void main (String []args)
	{
		List<String> list= Arrays.asList("Manoj","Anil","Kiran","Rahul","Manoj");
	
		list.stream().sorted((s1,s2)-> s1.compareTo(s2)).distinct().forEach(System.out::println);
		System.out.println("............................");
		List<String> name=list.stream().sorted((s1,s2)-> s1.compareTo(s2)).collect(Collectors.toList());
		name.forEach(System.out::println);
		
	}

}
