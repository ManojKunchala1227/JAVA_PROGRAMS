package Array_List;

public class Test1 {

	public static void main(String[] args) 
	{
		
		
		
		/*ArrayList<String> ar= new ArrayList<>();
		
		ar.add("apple");
		ar.add("banana");
		ar.add("orange");
		ar.add("custoreApple");
		
		
		Collections.sort(ar);*/
		

		
		
		/*
		 * ar.forEach(System.out::println);
		 * 
		 * 
		 * System.out.println("---------------------------------------");
		 * Collections.replaceAll(ar, "apple", "manoj");
		 * 
		 * 
		 * System.out.println(ar.toString());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("---------------------------------------");
		 * 
		 * 
		 * 
		 * System.out.println("for loop"); Collections.reverse(ar); for(String art :ar)
		 * {
		 * 
		 * System.out.println(art); }
		 */
		
		
		//ar.remove(1); // Based on index position
		
		//ar.remove("apple"); //based on the Object
		
		//ar.removeAll(ar); // It will remove all elements on the ArrayList
		
		//ar.forEach(System.out::println);

		//=================================================================
		/*
		 * List<Integer > li= new ArrayList<Integer>();
		 * 
		 * for(int i=1;i<21;i++) { li.add(i);
		 * 
		 * }
		 * 
		 * System.out.println("Total NO::"+li);
		 * 
		 * System.out.println("==============================================");
		 * 
		 * 
		 * 
		 * 
		 * Iterator<Integer> it=li.iterator();
		 */
		 /* 
		 * 
		 * while(it.hasNext()) { Integer num=it.next();
		 * 
		 * if(num%2!=0) { it.remove(); }
		 * 
		 * }
		 * 
		 * System.out.println(li);
		 */
		 
		 
		
		
		 
		 
		 
			/*
			 * while(it.hasNext()) { Integer num=it.next();
			 * 
			 * if(num %2!=0) { it.remove();
			 * 
			 * 
			 * 
			 * } }
			 * 
			 * System.out.println("Even::"+li);
			 */
		
		
		
		/*
		 * Predicate<Integer> pr= new Predicate<Integer>() {
		 * 
		 * @Override public boolean test(Integer t) {
		 * 
		 * return t%2!=0; }
		 * 
		 * 
		 * 
		 * }; System.out.println("Even Numbers::"+pr);
		 */
		 
		 
		 
		 
		 
		 
		 //===================================================================================================
		
		
		
		
		
		
		
		
		
		String nu="*";
		
		
		
		for(int i=5;i>=1;i--)
		{
			
			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
			
			
		}
		
		
		
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		

	}

}
