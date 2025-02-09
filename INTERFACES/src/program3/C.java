package program3;

public class C implements interface1, interface2
{

	@Override
	public void m1() 
	{
		
		interface1.super.m1();
		interface2.super.m1();
		System.out.println("overriden Method");
	}
	

}
