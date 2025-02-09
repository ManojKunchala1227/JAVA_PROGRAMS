package test3;

public class Rectangle extends GeometricShape
{
	private double width;
	private double length;
	
	public Rectangle()
	{
		width = 10;
		length=10;
	}
	

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
	@Override
	public  double computeArea(double width, double length)
	{
		
		
		this.length=length;
		this.width=width;
		
		
		
		
		area=width*length;
		return area;
	}
	
	@Override
	public void show()
	{
		System.out.println("Length of the Rectangle: "+width);
		System.out.println("Width of the Rectangle: "+length);
		System.out.println("Area of the Rectangle: "+area);
		
	}
	
	
	

}
