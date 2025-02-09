package P1;

public class Instance_block 
{
	public Instance_block() 
	{
		this(10); // this() method is used to call the one constructor from the other of the same class 
		System.out.println("0-Args Constructor");
		
	}
	public Instance_block(int x)
	{
		this(100,200);
		System.out.println("1-Args Constructo::"+x);
	}
	public Instance_block (int x, int y )
	{
		super();
		System.out.println("2-Args Constructors::"+x+" "+y);
	}
	
	// Instance Block
	
	{
		System.out.println("Instance Block");
	}
	static 
	{
		System.out.println("Static block");
	}
	
	
	public static void main(String args[])
	{
		new Instance_block();
	}

}
