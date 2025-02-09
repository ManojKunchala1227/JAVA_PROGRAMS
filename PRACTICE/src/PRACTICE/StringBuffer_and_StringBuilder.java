package PRACTICE;

public class StringBuffer_and_StringBuilder 
{

	public static void main(String[] args) 
	{
		
		
		
		long startTime=System.currentTimeMillis();
		StringBuffer buffer= new StringBuffer("Manoj");
		
		for(int i=0;i<10000;i++)
		{
			buffer.append(i);
		}
		
		System.out.println("Time Taken by StringBuffer : "+(System.currentTimeMillis()-startTime));
		
		
		long startTime2= System.currentTimeMillis();
		
		StringBuilder Builder= new StringBuilder("JAva");
		
		for(int i=0;i<1000;i++)
		{
			Builder.append(i);
		}
		System.out.println("Time Taken bu StringBuilder: "+(System.currentTimeMillis()-startTime2));
		
		
		
		
		

	}

}
