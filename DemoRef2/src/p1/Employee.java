package p1;
public class Employee {
	public String id,name,desg;
	public Address ad = new Address();
	public Contact ct =new Contact();
	public void getEmployee()
	{
		System.out.println("====Employee====");
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Designesion :"+desg);
	}

}
