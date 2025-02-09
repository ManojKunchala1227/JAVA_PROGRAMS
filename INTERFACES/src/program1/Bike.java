package program1;

public class Bike implements Vehicle 
{

	@Override
	public void run() {
		System.out.println("Bike is Running");
		
	}

	@Override
	public void horn() {
		System.out.println("Bike has horn");
		
	}

	public void digitalmeter()
	{
		System.out.println("Bike also have Digital Meter");
		
	}
}
