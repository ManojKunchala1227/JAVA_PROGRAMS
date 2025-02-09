package Serialization_De_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization_De_Serialization {

	public static void main(String[] args) throws Exception, IOException 
	{
		
		ArrayList<String> al= new ArrayList<>();
		
		al.add("B.tech");
		al.add("M.tech");
		al.add("B.Pharma");
		al.add("MCA");
		al.add("BE");
		al.add("BCA");
		
		//Serialization
		
		var fos= new FileOutputStream("C:\\Users\\ANAND\\Desktop\\MANOJ\\NARESH IT NOTES\\PLACEMENT CLASS\\Course.txt");
		var oos= new ObjectOutputStream(fos);
				
		try(fos; oos)
		{
			oos.writeObject(al);
			System.out.println("Object Strored Successfully.....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		//De-Serialization
		
		var fir= new FileInputStream("C:\\\\Users\\\\ANAND\\\\Desktop\\\\MANOJ\\\\NARESH IT NOTES\\\\PLACEMENT CLASS\\\\Course.txt");
		var ois= new ObjectInputStream(fir);
		
		try(fir; ois)
		{
			@SuppressWarnings("unchecked")
			ArrayList<String> al2=(ArrayList<String>)ois.readObject();
			System.out.println(al2);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		

	}

}
