package Stream_Sort;

import java.lang.reflect.Array;
import java.util.ArrayList;

record Customer(Integer custId,String custName,double custBill)
{
	
}
public class Stream_Sort_Demo3 {

	public static void main(String[] args)
	{
		ArrayList<Customer> ar= new ArrayList<>();
		ar.add(new Customer(1,"Manoj",20000D));
		
		ar.add(new Customer(2,"Kiran",35000D));
		ar.add(new Customer(3,"Rahul",53200D));
		ar.add(new Customer(4,"John",24600D));
		
		ar.stream().filter(bill -> bill.custBill()>30000).forEach(c-> System.out.println(c.custName()));
		
		

	}

}
