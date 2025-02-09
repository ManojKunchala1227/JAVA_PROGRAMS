package VECTOR;

import java.util.Vector;

record Customer (int customerId, String customerName, double customerBill)
{
	
}

public class VectorDemo4 {

	public static void main(String[] args) 
	{
		
		Vector<Customer> v= new Vector<>();
		v.add(new Customer(1,"MANOJ",3478.34));
		v.add(new Customer(2,"KRISHNA",3678.93));
		v.add(new Customer(3,"THARUN",7898.90));
		v.add(new Customer(4,"YAGNESHWAR",3689.34));
		v.add(new Customer(5,"ARUN",5864.45));
		
		v.stream().filter(cust-> cust.customerBill()>5000).forEach(cust->System.out.println(cust));

	}

}
