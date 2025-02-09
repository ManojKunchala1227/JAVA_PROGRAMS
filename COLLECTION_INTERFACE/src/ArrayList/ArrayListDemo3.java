package ArrayList;

import java.util.ArrayList;

record Product(int productId, String productName)
{
	
}

public class ArrayListDemo3 {

	public static void main(String[] args) 
	{
		
		ArrayList<Product> al= new ArrayList<>();
		
		al.add(new Product(1111,"Manoj"));

		al.add(new Product(2222,"Man"));

		al.add(new Product(3333,"Apple"));

		al.add(new Product(4444,"Honey"));
		
		
		al.forEach(System.out::println);
		

		
		
		

	}

}
