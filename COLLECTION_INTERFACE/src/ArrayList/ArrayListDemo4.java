package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String args[]) 
	{ 
	  ArrayList<String> al1=new ArrayList<>();
	  al1.add("Ravi");
	  al1.add("Rahul");
	  al1.add("Rohit");		  
	  
	  ArrayList<String> al2=new ArrayList<>();
	  al2.add("Pallavi");
	  al2.add("Sweta");
	  al2.add("Puja");		  

	  al1.addAll(al2);  

    //al1.forEach(x -> System.out.println(x.toUpperCase()));
    
    
    al1.forEach(x-> System.out.println(x.toUpperCase()));

    System.out.println(".................................");

	  ArrayList<String> al3=new ArrayList<>();
	  al3.add("Ravi");
	  al3.add("Rahul");
	  al3.add("Rohit");		  
	  
	  ArrayList<String> al4=new ArrayList<>();
	  al4.add("Pallavi");
	  al4.add("Rahul");
	  al4.add("Raj");
	  
	  al3.retainAll(al4);  

	  
	  
	  al3.forEach(x -> System.out.println(x));
    //al3.forEach(x -> System.out.println(x));		  
}

}
