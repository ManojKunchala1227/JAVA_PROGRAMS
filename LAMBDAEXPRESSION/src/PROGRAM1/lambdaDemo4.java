package PROGRAM1;

public class lambdaDemo4 
{
	public static void main(String [] args)
	{
		
		
		Runnable r1= ()->
		
		System.out.println(Thread.currentThread().getName());
		r1.run();
		
		
		Thread t1= new Thread(r1);
		
		t1.start();
		
		
		Thread t2= new Thread(r1);
		
		System.out.println(Thread.currentThread().getName());
		
		t2.start();
		
		
		
	}

}
