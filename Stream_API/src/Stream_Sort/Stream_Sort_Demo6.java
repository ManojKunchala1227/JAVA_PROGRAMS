package Stream_Sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Sort_Demo6 {

	public static void main(String[] args) 
	{
		List<String> list1= Arrays.asList("A","B","C","D");
		List<String> list2= Arrays.asList("E","F","G","H");
		List<String> list3= Arrays.asList("I","J","K","L");
		
		List<List<String>> list= Arrays.asList(list1,list2,list3);
		
		System.out.println(list);
				
		System.out.println(".........................");
		
		List<String> fl=list.stream().flatMap(n-> n.stream()).collect(Collectors.toList());
		System.out.println(fl);

	}

}

