package Hash_Map;

import java.util.HashMap;

public class HAshMapDemo3 {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> map = new HashMap<>(26,0.95f);
		map.put(1, "Java");
		map.put(2, "is");
		map.put(3, "best");
		map.remove(3);//will remove the complete Entry
		
		System.out.println("true or false :"+map.remove(3, "best"));
		
		
		
		System.out.println(map);
		
		String val=(String)map.get(3);
		System.out.println("Value for key 3 is: " + val);
		map.forEach((k,v)->System.out.println(k +" : "+v));

	}

}
