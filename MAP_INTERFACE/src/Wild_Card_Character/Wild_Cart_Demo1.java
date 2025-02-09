package Wild_Card_Character;

import java.util.ArrayList;
import java.util.List;

class Parent
{

}
class Child extends Parent
{
}
public class Wild_Cart_Demo1 
{
	public static void main(String [] args)
	{	
		List<?> lp = new ArrayList<Parent>(); 
		System.out.println("Wild card....");
	}
	

}
