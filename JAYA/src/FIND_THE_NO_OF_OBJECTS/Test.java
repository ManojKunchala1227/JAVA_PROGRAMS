package FIND_THE_NO_OF_OBJECTS;

public class Test 
{
	static int count;
	public String name;
	
	public void me(String name)
	{
		count++;
		this.name=name;
		//System.out.println(name);
	}
	
	public static void main(String args[])
	{
		Test t= new Test();
		Test t1= new Test();
		Test t2= new Test();
		Test t3= new Test();
		//t.me("manoj");
		t1.me("jaya");
		t2.me("Eeswar");
		t3.me("NIsha");
		
		System.out.println(t1.name+" "+t2.name+" "+t3.name);
		System.out.println(count);
		
	}

}
