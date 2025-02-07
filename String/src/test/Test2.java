package test;

public class Test2 {
	
	String name;
	static int count;
	
	
	public Test2(String name) 
	{
		count++;
		System.out.println(name);
	
	}
	
	public Test2() 
	{
		this("Manoj");
		count++;
			
	}

	public static void main(String[] args) 
	{
		Test2 t= new  Test2();
		
		
		System.out.println(count);
	

	}

}
