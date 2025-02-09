package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ConparatorDemo {

	public static void main(String[] args) 
	{
		ArrayList<Product> al= new ArrayList<>();
		
		
		al.add(new Product(222, "Laptop"));
		al.add(new Product(333, "Camera"));
		al.add(new Product(111, "Mobile"));
		
		
		
		
		/* Comparable <Product> p= new Comparable<Product>()    Comparable is checking the the class variable objects is there or no 
															 The comparable interface is not take the another class or interfaces variable as a parameter objects
				{

					@Override
					public int compareTo(Product d) 
					{
						return pproductName.compareTo(d.productName());
					}
			
				}; */
		
		
		Comparator<Product> cmp= new Comparator<Product>()
				{

					@Override
					public int compare(Product p1, Product p2) 
					{
						return p1.productId()-p2.productId();
						
					}
				
				};
				
				Collections.sort(al,cmp);
				
				System.out.println("Sorting based on the ID ");
				al.forEach(System.out::println);
				
				
				Comparator<Product> cmpName= new Comparator<Product>()
						{

							@Override
							public int compare(Product p1, Product p2) {
								return p1.productName().compareTo(p2.productName());
							}
							
					
						};

						Collections.sort(al,cmpName);
						System.out.println("Sorting based on the Name ");
						al.forEach(System.out::println);
	}

}
