package Function;

interface Function<T,R>
{
	public abstract R apply(T X);
}

public class functionDemo 
{

	public static void main(String[] args) 
	{
		
		Function<Integer, Integer> f1= X->
		(X*X*X);
		System.out.println(f1.apply(2));
		
		
		
		//Finding the Length of my city
		
		Function<String, Integer> f2= str->
		str.length();
		System.out.println(f2.apply("Hyderabad"));
		
		
		//my name start with M or not
		Function<String,Boolean> f3= str->
		str.startsWith("M");
		
		System.out.println(f3.apply("Manoj"));

	}

}
