package p1;
public class IClass implements ITest2
{
	public void m1(int x)
	{
		System.out.println("*****ITest-Implemented method*********");
		System.out.println("The value x :"+x);
	}
	public void m2(int y)
	{
		System.out.println("*****ITst2-Implemented method********");
		System.out.println("The value y :"+y);
	}

}
