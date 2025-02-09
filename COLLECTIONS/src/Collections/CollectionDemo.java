package Collections;

import java.util.Vector;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		Vector <Integer> v= new Vector<>();
		
		v.add(12);
		v.add(13);
		v.add(15);
		v.add(17);
		
		
		/*
		 * Consumer<Integer> c= new Consumer<Integer>() {
		 * 
		 * @Override public void accept(Integer t) { // TODO Auto-generated method stub
		 * System.out.println(t);
		 * 
		 * }
		 * 
		 * 
		 * };
		 */

		
		
		//Consumer <Integer> cun= num -> System.out.println(num);
		
		
		v.forEach(num -> System.out.println(num));
	}

}

