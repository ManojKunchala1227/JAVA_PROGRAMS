package Test;

public class Shape 
{
	public static Shape randshape()
	{
		switch((int)Math.random()*3)
		
		{
		case 0: 
			return new Circle();
			
		case 1: 
				return new Square();
				
		case 2: 
				return new Triangle();
		default: 
			System.out.println("Default case");
			return new Shape();
		
		}
		
	}
	
	Shape ()
	{
		
		
	}
	
	
	public void draw()
	{
		System.out.println("Shape draw");
		
	}
	 public void erase ()
	{
		 System.out.println("shape erase");
		 
	}

}
