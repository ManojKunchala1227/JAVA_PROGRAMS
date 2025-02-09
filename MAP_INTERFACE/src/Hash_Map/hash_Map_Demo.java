package Hash_Map;

import java.util.HashMap;

public class hash_Map_Demo {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hs= new HashMap<>();
		
		hs.put(1, "Manoj");
		hs.put(2, "Ajay");
		hs.put(3, "Mano");
		hs.put(4, null);
		hs.put(5, "Kiaran");
		hs.put(6, "Jaya");
		hs.put(7, "somulu");
		
		System.out.println("Initial Map Elements : "+hs);
		
		System.out.println("Key 5 is present or not : "+hs.containsKey(5));
		
		System.out.println("JME is presenty or not :"+hs.containsValue("Manoj"));
		System.out.println("Size of Map :"+hs.size());
		hs.clear();
		System.out.println("Map Elements After Clear: "+hs);
		
		

	}
}
