package p1;
import java.util.*;
public class ReadStudent 
{
	public Student st = null;
	public Scanner s= null;
public ReadStudent (Student st, Scanner s)
{
	this.st=st;
	this.s=s;
}
public void getread() 
{
	System.out.println("Enter the Name :");
	st.name=s.nextLine();
	System.out.println("ENter the Roll No :");
	st.rno=s.nextLine();
	System.out.println("ENter the Brach Name :");
	st.br=s.nextLine();
	System.out.println("ENter the Email ID :");
	st.ct.mId=s.nextLine();
	System.out.println("Enter Phone N0 :");
	st.ct.phNo=s.nextInt();
	System.out.println("Enter the City :");
	st.ad.city=s.nextLine();
	System.out.println("Enter the State :");
	st.ad.state=s.nextLine();
	System.out.println("Enter the Pincode :");
	st.ad.pincode=s.nextInt();

}
}
