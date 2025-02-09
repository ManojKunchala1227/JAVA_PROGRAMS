package p1;

	public class Student 
{
	public int roll;
	public String name,branch;
	
	public Address ad= new Address ();
	public Contact ct=new Contact();
	
	public void getStudent() {
	System.out.println("ROll Number :"+roll);
	System.out.println("Student name :"+name);
	System.out.println("Branch :"+ branch);
}
}
