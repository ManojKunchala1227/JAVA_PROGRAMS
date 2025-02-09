package program1;

public class Car  implements Vehicle
{

	@Override
	public void run() {
		System.out.println("Car is running");
		
	}

	@Override
	public void horn() {
		System.out.println("Car has horn");
		
	}

	@Override
	public  void digitalmeter() 
	{
		System.out.println("Car has have Digital Meter");
		
	}
	

}
