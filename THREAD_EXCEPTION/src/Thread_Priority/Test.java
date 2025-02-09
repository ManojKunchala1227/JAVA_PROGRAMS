package Thread_Priority;

public class Test extends Thread
{
	@Override
	public void run()
	{
		int count=0;
		
		for (int i=1;i<=1000000;i++)
		{
			count++;
			
			
		}
		
		
		System.out.println("Running thread name is: "+Thread.currentThread().getName());
		System.out.println("Running Thread Priority : "+Thread.currentThread().getPriority());
	}
	
	
	public static void main(String[] args) 
	{
		Test ts= new Test();
		Test ts2= new Test();

		

		
		ts.setName("Child 1");
		ts.setPriority(MAX_PRIORITY);
		ts.start();
		
		ts2.setName("Child 2");
		ts2.setPriority(MIN_PRIORITY);
		ts2.start();
		
		
		
		
//		Thread t = Thread.currentThread();
//		t.setPriority(8);
//		
//		Thread t1= new Thread();
//		System.out.println(t1.getPriority());
		
	

	}

}

