package VECTOR;

import java.util.ArrayList;
import java.util.Vector;

public class Vector_and_Arraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> al= new ArrayList<>();
		
		long startTime=System.currentTimeMillis();
		for(int i=0;i<=1000000;i++)
		{
			al.add(i);
		}
		long endTime=System.currentTimeMillis();
		
		System.out.println("Total Time taken by the ArrayList: "+(endTime- startTime)+"ms");
		
		
		
		
		
		
		Vector<Integer> al1= new Vector<>();
		
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<=1000000;i++)
		{
			al1.add(i);
		}
		long endTime1=System.currentTimeMillis();
		
		System.out.println("Total Time taken by the Vector: "+(endTime1-startTime1)+" ms");
		
		

	}

}
