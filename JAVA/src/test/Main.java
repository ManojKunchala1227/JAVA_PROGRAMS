package test;

class A
{
	public A()
	{
		System.out.println("A");
	}
}
class B extends A
{}

class C extends B
{
	public C()
	{
		System.out.println("C");
	}
}


public class Main {

	public static void main(String[] args) 
	{
		new C();

	}

}
