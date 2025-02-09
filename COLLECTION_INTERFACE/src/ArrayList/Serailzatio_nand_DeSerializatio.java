package ArrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

record Employee(int eId, String eName) implements Serializable
{
	
}

public class Serailzatio_nand_DeSerializatio 
{

	public static void main(String[] args) throws Exception
	{
		ArrayList<Employee> al= new ArrayList<>();
		
		al.add(new Employee(1,"Manoj"));
		al.add(new Employee(2,"Rajesh"));
		al.add(new Employee(3,"Scot"));
		al.add(new Employee(4,"John"));
		
		
		//Serialization
		
		var fos= new FileOutputStream("C:\\\\Users\\\\ANAND\\\\Desktop\\\\MANOJ\\\\NARESH IT NOTES\\\\PLACEMENT CLASS\\\\Employee.txt");
		var oos= new ObjectOutputStream(fos);
		
		try(fos;oos)
		{
			oos.writeObject(al);
			System.out.println("Object Stored Successefully.......");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//De-Serialization
		
		var fis= new FileInputStream("C:\\\\Users\\\\ANAND\\\\Desktop\\\\MANOJ\\\\NARESH IT NOTES\\\\PLACEMENT CLASS\\\\Employee.txt");
		var ois= new ObjectInputStream(fis);
		
		try(fis;ois)
		{
			@SuppressWarnings("unchecked")
			ArrayList<String >al2=(ArrayList<String>)ois.readObject();
			System.out.println(al2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
