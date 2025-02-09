package LambdaExpression;
interface length
{
	int grtLength(String str);
}

public class Lambdademo3 {

	public static void main(String[] args) 
	{
		length l1= (str)-> str.length();
		
							System.out.println(l1.grtLength("INDIA"));
							
							
		
			

	}

}
