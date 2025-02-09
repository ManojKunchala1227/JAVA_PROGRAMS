package consumerDemo1;

import java.util.function.Consumer;

interface consumeR<T>
{
	 void accept(T x);
	
}



public class consumer 
{

	public static void main(String[] args) 
	{
		Consumer<Integer> c1 = x -> 
		System.out.println(x);
		c1.accept(12);
		
		
		Consumer<Boolean> c2=x->
		System.out.println(x);
		c2.accept(true);
		
		
		Consumer<Product> c3= prod ->
		System.out.println(prod);
		
		c3.accept(new Product(111,"manoj"));
		//System.out.println(c3);
		

	}

}


record Product (Integer id, String name)
{
	
}
