package test;

import java.io.Closeable;
import java.io.IOException;

public class FileResourse implements Closeable
{

	@Override
	public void close() throws IOException
	{
		System.out.println("File Resouse Closed successfuly");
		
	}

}
