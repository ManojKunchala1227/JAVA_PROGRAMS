package AnonymousInnerClass;

public class AnonymousDemo {

	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle()
				{

					@Override
					public void run() {
						System.out.println("Bike is Running");
						
					}
			
				};
				
				Vehicle v2 = new Vehicle()
						{

							@Override
							public void run() {
								System.out.println("Car is Running");
								
							}
					
					
						};
						
				v.run();
				v2.run();
		

	}

}
