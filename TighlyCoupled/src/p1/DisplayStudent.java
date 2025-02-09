package p1;

public class DisplayStudent
{
	Student sd=null;
	public DisplayStudent(Student sd) 
	{
		this.sd=sd;
	}
	public void display()
	{
		sd.getStudent();
		sd.ct.getContact();
		sd.ad.getAddress();
	}

}
