package test3;

public class Test 
{

	public static void main(String[] args)
	{
		Rectangle r= new Rectangle();
		
		r.computeArea(10,10);
		
		Cuboid c= new Cuboid();
		c.computeArea(10,10,5);
		r.show();
		c.show();

	}

}
