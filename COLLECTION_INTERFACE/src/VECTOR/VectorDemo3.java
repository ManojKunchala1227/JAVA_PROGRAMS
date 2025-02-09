package VECTOR;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo3 
{
	public static void main (String []args) 
	{
		Vector<Integer> v= new Vector<>();
		
		int x[]= {22,33,44,55,45,67};
		
		for(int i=0; i<x.length;i++)
		{
			v.add(x[i]);
			
		}
		
		Collections.sort(v);
		
		System.out.println("Maximum elemenys is: "+Collections.max(v));
		System.out.println("Maximum elemenys is: "+Collections.min(v));
		System.out.println("Vector Elements : ");
		v.forEach(y-> System.out.println(y));
		
		System.out.println("........................................");
		
		Collections.reverse(v);
		v.forEach(y-> System.out.println(y));
	}

}
