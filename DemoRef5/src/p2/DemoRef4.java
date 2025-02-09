package p2;
import java.util.*;
import p1.*;

public class DemoRef4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student st= new Student();
		ReadStudent rs= new ReadStudent(st,s);
		DisplayStudent ds= new DisplayStudent(st);
		rs.getread();
		ds.display();
		s.close();

	}

}
