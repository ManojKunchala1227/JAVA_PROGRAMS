package Yield_Method;

class Test implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			String name= Thread.currentThread().getName();
			System.out.println("i values is: "+i+" By "+name);
			
			if(name.equals("Child1"))
			{
				
				Thread.yield();
			}
		}
		
		
	}
	
}
public class ThreadYieldMethod 
{

	
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		
		Thread t1= new Thread(t, "Child1");
		Thread t2= new Thread(t,"Child2");
		
		t1.start();
		t2.start();

	}

}
