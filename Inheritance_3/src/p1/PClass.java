package p1;
public class PClass 
{
	public static int x;
	public static void dis()
	{
		System.out.println("******PClass*****");
		System.out.println("The value of x :"+x);
	}
	static 
	{
		System.out.println("******PClass-Static-Block*****");
		System.out.println("The value of x :"+x);
		
		
		
	}//Static-block

}
