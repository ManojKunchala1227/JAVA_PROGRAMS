package AnonymousFunctionalInterface;

public class AnonymousDemo {

	public static void main(String[] args) 
	{
		
		
		// Functional Interface and Lambda Expression
		Vehicle v = ()->
						
						System.out.println("Bike is Running");
				
				
				Vehicle v2 = ()->
								System.out.println("Car is Runnig");
						
				v.run();
				v2.run();
		

	}

}
