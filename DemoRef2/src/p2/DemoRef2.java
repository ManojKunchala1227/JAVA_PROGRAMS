package p2;
import java.util.Scanner;
import p1.Employee;
public class DemoRef2 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Employee em = new Employee();
		System.out.println("Enter ID=");
		em.id=s.nextLine();
		System.out.println("Enter Name=");
		em.name=s.nextLine();
		System.out.println("Enter Designesion=");
		em.desg=s.nextLine();
		System.out.println("Enter Mail ID=");
		em.ct.mId=s.nextLine();
		System.out.println("Enter Employee Phone Number=");
		em.ct.phNo=s.nextInt();
		System.out.println("Enter City");
		em.ad.city=s.nextLine();
		System.out.println("Enter State");
		em.ad.state=s.nextLine();
		System.out.println("Enter Pincode");
		em.ad.pincode=s.nextInt();
		em.getEmployee();
		em.ad.getadress();
		em.ct.getcontact();
		s.close();
		

	}

}
