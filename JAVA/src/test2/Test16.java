package test2;


class Aaa
{
	public void foo()
	{
		System.out.println("A");
	}
}


class Baa extends Aaa
{
	public void foo()
	{
		System.out.println("B");
	}
}




public class Test16 
{

	public static void main(String[] args) 
	{
		Aaa ob;
		
		Baa ob2= new Baa();
		ob2.foo();
		
		ob=ob2;
		
		
		ob.foo();

	}

}
