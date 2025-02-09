package p1;
public class CClass extends PClass
{
	public CClass(int x, int y, int z)
	{
		this(x,y);
		System.out.println("*****CCLass********");
		System.out.println("The value of Z :"+z);
		
	}
	public CClass(int x, int y)
	{
		super(x);
		System.out.println("*****CCLass********");
		System.out.println("The value of Y :"+y);
		
	}
	public void m(int a,int b, int c) 
	{
		this.m(a,b);
		System.out.println("*******CClass-m(c)**********");
		System.out.println("The value of C :"+c);
	}
	public void m(int a, int b)
	{
		super.m(a);
		System.out.println("********CClass-m(b)*******");
		System.out.println("The value of B :"+b);
	}

}
