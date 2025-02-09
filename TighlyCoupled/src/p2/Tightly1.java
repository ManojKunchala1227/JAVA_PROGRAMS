package p2;
import java.util.*;
import p1.*;

public class Tightly1 
{

	public static void main(String[] args) {
		
		Scanner s= new Scanner (System.in);
		Student sd = new Student ();
		ReadStudent rs= new ReadStudent(sd,s);
		DisplayStudent ds= new DisplayStudent(sd);
		
		
		rs.read();
		ds.display();
		
		
		
		
		s.close();
	}

}
