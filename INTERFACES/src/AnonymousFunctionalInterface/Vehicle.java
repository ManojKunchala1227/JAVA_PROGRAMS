package AnonymousFunctionalInterface;
@FunctionalInterface
public interface Vehicle
{
	
	// A Functional Interface may contain number of default and static methods but it must have a  only one Abstract method
	void run();
	
	
	
	default void me()
	{
		
	}
	static void  mee()
	{
		
	}
}
