package Interrupted_Method_Thread_Class;

public class InterruptedThread
{
    public static void main(String[] args) 
	{
        Thread thread = new Thread(new MyRunnable());
        thread.start();
     
        try 
		{
           Thread.sleep(3000);//main thread is waiting for 3 sec
           System.out.println("mee");
        } 
		catch (InterruptedException e) 
		{
            e.printStackTrace();
        }
        
       thread.interrupt();  //child thread interrupted
    }
}

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
	{
        try 
		{
            while (!Thread.currentThread().isInterrupted())
			{
                System.out.println("Thread is running...");
                Thread.sleep(500);
            }
        } 
		catch (InterruptedException e) 
		{
            System.out.println("Thread interrupted gracefully.");
        } 
		finally 
		{
            System.out.println("Thread resource can be release here.");
        }
    }
}