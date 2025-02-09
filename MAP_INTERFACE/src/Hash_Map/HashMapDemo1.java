package Hash_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) 
	{
		Map <Integer, String> mp= new HashMap<>();
		mp.put(1,"C");
		mp.put(2,"C++");
		mp.put(3,"Java");
		mp.put(4,".Net");
		
		
		mp.forEach((k,v)->System.out.println("Key :"+k+"Value :"+v));
		
		System.out.println("Return old Object value: "+mp.put(4,"Python"));
		
		Set keys=mp.keySet();
		
		System.out.println("All keys are: "+keys);
		
		Collection values=mp.values();
		System.out.println("All keys are: "+values);
		
		
		for(Map.Entry m: mp.entrySet())
		{
			System.out.println(m.getKey()+"="+m.getValue());
		}
		
		

	}

}
