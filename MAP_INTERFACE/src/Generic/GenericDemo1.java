package Generic;

import java.util.ArrayList;

public class GenericDemo1 {

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Ravi");
		al.add("Aswin");
		al.add("Rahul");
		al.add("Raj");
		al.add("Samir");

		for(int i =0; i<al.size(); i++)
		{ 
		   String s = (String) al.get(i);
		   System.out.println(s.toUpperCase());
		}

	}

}
