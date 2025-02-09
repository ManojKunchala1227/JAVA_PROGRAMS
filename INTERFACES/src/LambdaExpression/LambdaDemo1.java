package LambdaExpression;

public class LambdaDemo1 {

	public static void main(String[] args) 
	{
		Callable c=()->
		System.out.println("calling the method");
		
		c.call();
		

	}

}
