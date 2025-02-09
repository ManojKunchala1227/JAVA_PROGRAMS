package LambdaExpression;

interface Calculate
{
	void doSum(int x, int y);
	
}

public class lambdaDemo2 {

	public static void main(String[] args) 
	{
		Calculate c1= (c,d)->
							System.out.println(c+d);
							
					c1.doSum(10, 5);
	}

}
