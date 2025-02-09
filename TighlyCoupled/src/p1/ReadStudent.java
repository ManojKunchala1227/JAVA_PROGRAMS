package p1;
import java.util.*;
public class ReadStudent
{
	public Student sd= null;
	public Scanner s = null;
	public ReadStudent (Student sd, Scanner s) {
		this.sd=sd;
		this.s=s;
	}
	
	public void read() 
	{
		System.out.println("Enter the Roll number :");
		sd.roll=Integer.parseInt(s.nextLine());
		System.out.println("Enter the Student Name :");
		sd.name=s.nextLine();
		System.out.println("Enter the Branch :");
		sd.branch=s.nextLine();
		System.out.println("Enter the Mainl id :");
		sd.ct.MId=s.nextLine();
		System.out.println("Enter the Phone nmber: ");
		sd.ct.phNo=Integer.parseInt(s.nextLine());
		System.out.println("Enter the City :");
		sd.ad.City=s.nextLine();
		System.out.println("Enter the State :");
		sd.ad.State=s.nextLine();
		System.out.println("Enter the Pincode :");
		sd.ad.Pincode=s.nextInt();
		
	}

}
