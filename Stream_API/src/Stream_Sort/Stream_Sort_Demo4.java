package Stream_Sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Sort_Demo4 
{
	public static void main(String []args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		//Add value 10 to each and very number
		
		list.stream().map(num-> num+10).forEach(System.out::println);
		
		//Find even number in stream and collect the cubs
		System.out.println("......................................");
		
		List<Integer> even = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		even.stream().filter(num-> num%2==0).map(n-> n*n*n).forEach(System.out::println);
		
		System.out.println("......................................");
		
		List<String> name=Arrays.asList("Raj","Scott","subramanyam","Rahul");
		
		name.stream().map(num-> num.length()).forEach(System.out::println);
		
		System.out.println("......................................");
		Stream.of("Raj","Scott","subramanyam","Rahul").map(nu-> nu.length()).forEach(System.out::println);
		
	}

}
