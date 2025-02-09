package program1;
public interface Vehicle 
{
	void run();
	void horn();
	
	default void digitalmeter()
	{
		System.out.println("Digital Meter Facility");
	}

}
