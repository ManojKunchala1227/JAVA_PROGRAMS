package INTERFACE_ACCEPT;

interface Moveable
{
	void m1();
	
	
	
	
	default void m2()
	{
		System.out.println("Default method");
		m4();
		m5();
		
		
	}
	
	static void m3()
	{
		System.out.println("static method");
		m4();
//		m5(); ss
	}
	
	
	private static void m4()
	{
		System.out.println("Private Static method");
	}
	
	private void m5()
	{
		System.out.println("Private non static method");
	}
	
	
}


class Implementer implements Moveable
{

	@Override
	public void m1() {
		System.out.println("M1 method implemented");
		
	}
	
	
			
	
}
public class interfaceAcceptDemo 
{

	public static void main(String[] args) 
	
	{
		
		Implementer i= new Implementer();
		
		i.m1();
		i.m2();
		Moveable.m3();
		
		
		

	}

}
