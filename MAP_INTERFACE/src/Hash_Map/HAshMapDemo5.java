package Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class HAshMapDemo5 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
        //if the key is not present, it will return default value .It is used to avoid null
		String value = map.getOrDefault("C","Key is not available");
		System.out.println(value);
		System.out.println(map); 
	}
}
