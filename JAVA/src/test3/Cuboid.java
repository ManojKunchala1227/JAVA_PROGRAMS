package test3;

public class Cuboid extends Rectangle 
{
	
	private double height;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
	
	public Cuboid()
	{
		height=15;
	}
	
	
	
	public double computeArea(double width, double length, double heigth)
	{
		super.computeArea(width, length);
		
		area = length*width*heigth;
		
		return area;
	}
	
	@Override
	
	
	public void show()
	{
		
		System.out.println("Length of the Rectangle: "+getWidth());
		System.out.println("Width of the Rectangle: "+getLength());
		System.out.println("Width of the Rectangle: "+height);
		System.out.println("Area of the Rectangle: "+area);
		
		
		
	}
	
	

}
