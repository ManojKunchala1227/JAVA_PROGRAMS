package p1;

public class CClass extends PClass 
{
	public CClass (int x, int y)
	{
		super(x); //PClass_Constractor_call
		System.out.println("******CClass*******");
		System.out.println("The value of Y :"+y);
		
		
	}
}
