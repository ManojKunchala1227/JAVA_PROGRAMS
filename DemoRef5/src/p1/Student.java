package p1;
public class Student {
public String rno,name,br;
public Address ad = new Address();
public Contact ct = new Contact();
public void getstudent()
{
	System.out.println("*****Student*****");
	System.out.println("Name"+name);
	System.out.println("Roll No :"+rno);
	System.out.println("Branch"+br);
}

}
