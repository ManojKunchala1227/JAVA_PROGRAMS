package VECTOR;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args)
	{
		Vector<Integer> v= new Vector<>(5,1);
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		System.out.println(v.capacity());
		System.out.println(v.get(2));
		
		v.add(6);
		System.out.println(v.capacity());
		
		
		
		
		
		
//		for(int i=0;i<100;i++)
//		{
//			v.add(i);
//		}
//		
//		System.out.println("After adding 100 elements capacity :"+v.capacity());
//		v.add(101);
//		
//		System.out.println("After adding 101 elements capacity : "+ v.capacity());
}

}
