package p1;

public class CClass extends PClass
{
	public static void dis (int x, int y, int z)
	{
//		this.dis(x,y);
		System.out.println("******CClass(x,y,z)*****");
		System.out.println("The value of X :"+x);
		System.out.println("The value of Y :"+y);
		System.out.println("The value of Z :"+z);
		
	}
	public static void dis(int x, int y )
	{
//		super.dis(x);
		System.out.println("******CClass(x,y)*****");
		System.out.println("The value of X :"+x);
		System.out.println("The value of Y :"+y);
	}
	public void access (int x, int y, int z)
	{
		super.dis(x);
		this.dis(x,y);
		this.dis(x,y,z);
	}

}
