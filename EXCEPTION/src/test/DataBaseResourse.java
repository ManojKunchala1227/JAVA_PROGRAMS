package test;

public class DataBaseResourse implements AutoCloseable
{

	@Override
	public void close() throws Exception 
	{
		System.out.println("Data Base Resouce closed automatically");
		
	}
	

}
