package STREAM_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API_Demo {

	public static void main(String[] args)
	{
		List<String> st= new ArrayList<>();
		st.add("manoj");
		st.add("Kiran");
		st.add("Rajesh");
		st.add("Krishna");
		st.forEach(System.out::println);
	System.out.println("................................");	
		Stream<String >s=st.stream();
		
		
		
		Stream<String> s1=st.stream();
		s.forEach(System.out::println);
		
		
		Stream.of();
		
	}

}

