package FIND_THE_NO_OF_OBJECTS;


public class OBJ 
{
	static int count;
	String name;
	public OBJ(String name) 
	{
		count++;
		
		this.name=name;
		System.out.println(name);
		
	}
	
	public OBJ() 
		{
		this("kumar");
		count++;
		
			System.out.println("0-ArgConstructor");
		}


	public static void main(String[] args) 
	{
		
		
		
		OBJ bj=new OBJ();
		/*
		 * OBJ bj1=new OBJ("manoj");
		 * 
		 * OBJ bj2=new OBJ("Jaya");
		 * 
		 * OBJ bj3=new OBJ(); OBJ bj5=new OBJ("Eeswar");
		 * 
		 * OBJ bj6=new OBJ("Nisha");
		 */
		System.out.println(count);
		
		
		
		

	}

}
