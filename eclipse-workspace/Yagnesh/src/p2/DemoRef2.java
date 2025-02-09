package p2;
import java.util.*;
import p1.Employee;


public class DemoRef2 {

	public static void main(String[] args) 
	{
		 Scanner s = new Scanner(System.in);
	       
	       Employee ee = new Employee();
	       
	       System.out.println("Enter the Emp-Id:");
	       ee.id = s.nextLine();
	       
	       System.out.println("Enter the Emp-Name:");
	        ee.name = s.nextLine();
	       
	        System.out.println("Enter the Emp-Desg:");
	         ee.desg = s.nextLine();
	         
	         System.out.println("Enter the Emp-City:");
	         ee.ad.city = s.nextLine();
	         
	         System.out.println("Enter the Emp-State:");
	         ee.ad.state = s.nextLine();
	         
	         System.out.println("Enter the Emp-Pincode:");
	         ee.ad.pincode = s.nextInt();
	         
	         System.out.println("Enter the Emp-MailId:");
	         ee.us.mid = s.nextLine();
	         
	         System.out.println("Enter the Emp-PhNo:");
	         ee.us.phNo = s.nextLong();


	          ee.getEmployee();
	          ee.ad.getAddress();
	          ee.us.getUser();
	          
	          s.close();

	}

}