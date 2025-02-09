package Duplicate_Object_By_Using_CloneMethod;

public class Main
{

	public static void main(String[] args)  throws CloneNotSupportedException
	{
		Customer c= new Customer();
		c.id=111;
		c.name="Manoj";
		
		
		Customer c2= (Customer) c.clone();  //Deep Copy // Duplicate Object by Using Clone() Method
		
		c2.id=222;
		c2.name="Miami";
		
		System.out.println(c);
		System.out.println(c2);
		
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());

	}

}
