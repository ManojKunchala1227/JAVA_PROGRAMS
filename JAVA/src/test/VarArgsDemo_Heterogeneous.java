package test;
class Demo4
{
	public void input(Object ...x) 
	{		
		for(Object y : x)
		{
			System.out.println(y);
		}
		System.out.println("..................");
	}
}
public class VarArgsDemo_Heterogeneous {

	public static void main(String[] args) {
		Demo4 d = new Demo4();
		d.input(10);
		d.input("Ravi","NIT",new String("32"),34.89, true);
		d.input(false, 12, 45.89, 45.6f);

	}

}
