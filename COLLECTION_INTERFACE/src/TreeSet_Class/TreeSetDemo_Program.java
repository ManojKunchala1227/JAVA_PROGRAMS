package TreeSet_Class;

import java.util.TreeSet;



record Student(int studentId, String studenetName)
{
	
}

public class TreeSetDemo_Program {

	public static void main(String[] args) 
	{
		TreeSet<Student> ts1 = new TreeSet<>((s1,s2)-> s1.studentId()-s2.studentId());
		
		ts1.add(new Student(333, "Aryan"));
		ts1.add(new Student(222, "Ravi"));
		ts1.add(new Student(111, "Zuber"));
		System.out.println("Sorting based on the Student Id (Ascending)");
		ts1.forEach(s -> System.out.println(s));
		
		
        TreeSet<Student> ts2 = new TreeSet<>((s1,s2)-> s2.studentId()-s1.studentId());
		
		ts2.add(new Student(333, "Aryan"));
		ts2.add(new Student(222, "Ravi"));
		ts2.add(new Student(111, "Zuber"));
		System.out.println("Sorting based on the Student Id (Descending)");
		ts2.forEach(s -> System.out.println(s));
		
		 TreeSet<Student> ts3 = new TreeSet<>((s1,s2)-> s1.studenetName().compareTo(s2.studenetName()));
		 
		 
		 ts3.add(new Student(333, "Aryan"));
		 ts3.add(new Student(222, "Ravi"));
		 ts3.add(new Student(111, "Zuber"));
	System.out.println("Sorting based on the Student Name (Ascending)");
			ts3.forEach(s -> System.out.println(s));
			
		
		
	}

}
