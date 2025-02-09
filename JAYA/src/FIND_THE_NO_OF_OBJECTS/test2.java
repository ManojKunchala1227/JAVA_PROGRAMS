package FIND_THE_NO_OF_OBJECTS;

public class test2 {
	
	String name;
	static int count=0;
	
	
	
	public test2(String name)
	{
		count++;
		this.name=name;
		
	}
	public test2() {
		this("kumar");
		count++;
	}

	public static void main(String[] args) 
	{
		test2 t= new test2();
		test2 t3= new test2();
		
		test2 t1= new test2("manoj");
		
		
		System.out.println("no of objects created is ::"+count);
		

	}

}
