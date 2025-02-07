package test;

public class PreIncrementAndPostIncrement 
{
	static int a=5;
	static int b=++a;
	static int c=b++;
	
	public static void main(String args[])
	{
		System.out.println("values is  :: a "+(a));
		System.out.println("values is  :: b "+(b));
		System.out.println("values is  :: c "+(c));
	}

}
