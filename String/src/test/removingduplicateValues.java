package test;

import java.util.LinkedHashSet;
import java.util.Set;

public class removingduplicateValues {
public static String removeDuplicate(String str)
{
	Set<Character> chr= new LinkedHashSet<>();
	
	StringBuffer b= new StringBuffer();
	
	//char [] e=str.toCharArray();
	
	
	for(char c: str.toCharArray())
	{
		if(!chr.contains(c))
		{
			
			chr.add(c);
			b.append(c);
			
		}
	}
	return b.toString();
}
	
	
	public static void main(String[] args) {
		System.out.println(removeDuplicate("programming"));

	}

}
