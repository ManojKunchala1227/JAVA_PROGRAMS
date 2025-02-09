package test;


class Parent
{
	public Parent()
	{		
		this("manoj");
		
		System.out.println("No Argument constructor of Parent");
	}
	
	Parent(String str)
	{
		super();
	
		System.out.println("Parameterized constructor of Parent :"+str);
	}
}
class Child extends Parent
{
    Child()
    {
    	super();
    	System.out.println("No Argument constructor of child");
    }
}

public class InheritanceDemo {

	public static void main(String[] args) 
	{
		new Child();

	}

}