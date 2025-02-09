package test;

class Demo
{
	public void input(int ...x)
	{
		System.out.println("Method Executed");
	}
}


public class VarArgsDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.input();
		d.input(3);
		d.input(5,10);
		d.input(5,10,30);

	}

} 