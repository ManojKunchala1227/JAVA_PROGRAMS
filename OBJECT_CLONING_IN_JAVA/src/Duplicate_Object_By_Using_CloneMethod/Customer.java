package Duplicate_Object_By_Using_CloneMethod;

public class Customer  implements Cloneable
{
	int id;
	String name;
	
	@Override
	
	protected Object clone() throws CloneNotSupportedException
	{
		
		return super.clone();
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	

}
