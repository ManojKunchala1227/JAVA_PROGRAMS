package test;


class Demo2
{
	public void input(int ...x) //100  200   300   400
	{		
		int sum = 0;
		
		for(int y : x)
		{
		   sum = sum + y;	
		}
		System.out.println("Sum of parameters :"+sum);
		
	}
}


public class VArArgsDemo2 
{
	public static void main(String[] args)
	{
		Demo2 d = new Demo2();
		d.input();
		d.input(3);
		d.input(5,10);
		d.input(5,10,30);
		d.input(100,200,300,400);

	}

}



