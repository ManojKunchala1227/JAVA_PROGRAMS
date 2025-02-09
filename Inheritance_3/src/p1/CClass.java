package p1;

public class CClass extends PClass
{
	public static int y;
	public static void dis2()
	{
		System.out.println("******CClass*****");
		System.out.println("The value of x :" +x);
		System.out.println("The value of y :" +y);
		
	}
	static 
	{
		System.out.println("******CClass-Static-Block*****");
		System.out.println("The value of x :" +x);
		System.out.println("The value of y :"+y);
		
		
		
	}//Static-block

}
