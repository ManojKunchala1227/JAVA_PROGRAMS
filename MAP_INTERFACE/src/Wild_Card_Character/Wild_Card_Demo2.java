package Wild_Card_Character;

import java.util.ArrayList;
import java.util.List;

public class Wild_Card_Demo2 
{public static void main(String[] args) 
{
	List<? extends Number> list1 = new ArrayList<Long>();

	List<? super String> list2 = new ArrayList<Object>();

	List<? super Beta> list3 = new ArrayList<Alpha>();

	List list4 = new ArrayList();
	
	System.out.println("yes");
}
}

class Alpha
{
}
class Beta extends Alpha
{
}
class Gamma extends Alpha
{
}