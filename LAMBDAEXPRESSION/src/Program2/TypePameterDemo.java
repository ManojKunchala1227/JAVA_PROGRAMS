package Program2;

class Accept<T>
{
	private T x;
	
	
	public Accept(T x)
	{
		super();
		this.x=x;
	}
	public T getX()
	{
		return this.x;
	}
}





 class TypePameterDemo
{
	 public static void main(String[]args)
	 {
		 
		 
		 //Wrapper Class
		Accept<Integer> intType= new Accept<>(90); 
		System.out.println("Integer type:"+ intType.getX());
		
		Accept<Double> doubleType= new Accept<>(33.44);
		System.out.println("Double type:"+ doubleType.getX());
		
		//User Defined Class 
		Accept <Student> studentType= new Accept<>(new Student(111,"A"));
		System.out.println("Student type:"+studentType.getX());
		
		
		
		
		// We cannot pass any primitive type to this type parameter
		
		
		
//				Accept<int> inttype= new Accept<>(80);
//				System.out.print("int Type:"+ int.getX());
				
				
	 }
}
 
 
 
 record Student (int id, String name)
 {
	 
 }
 
 
 
