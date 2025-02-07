package test;

import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	
	

	public static void main(String[] args) 
	{
		//Stream<Integer> number=Stream.of(1,2,3,5,6,7,8);
		
		//List<Integer> collect = number.filter(n->n%2==0).collect(Collectors.toList());
		//List<Integer> collect = number.filter(n->n%2==0).collect(Collectors.toList());
		List<Integer> number=List.of(1,2,3,4,5);
		//List<Integer> collect1 = number.filter(n->n%2!=0).collect(Collectors.toList());
	

		number.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
		//System.out.println(collect);
		//System.out.println(collect1);
		
		
		
		
	}

}

