package p1;
public class DisplayStudent {
	public Student st= null;
public DisplayStudent(Student st)
{
	this.st=st;
}
public void display()
{
	st.getstudent();
	st.ct.getcontact();
	st.ad.getaddress();
	
}

}
