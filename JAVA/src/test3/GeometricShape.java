package test3;

public class GeometricShape
{
	public String shapeType;
	public double area;
	
	
	public GeometricShape()
	{
		
		shapeType= null;
		
		area=0.0;
		
	}
	
	
	public double computeArea(double value1, double values2)
	{
		return area;
		
		
	}
	
	
	public void show()
	{
		System.out.println("shapetype : "+shapeType);
		System.out.println("Are : "+area);
	}

}
