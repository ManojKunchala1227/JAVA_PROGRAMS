package TreeSet_Class;

import java.util.TreeSet;

public class ThreeSetDemo1 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> ts1 = new TreeSet<>((i1,i2)-> (i2-i1));
		
		ts1.add(20);
		ts1.add(10);  
		ts1.add(30);
		
		ts1.forEach(System.out::println);

	}

}
