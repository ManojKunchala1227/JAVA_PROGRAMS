package test;

public class StudentGraceCalculator {

	public static void main(String[] args) 
	{
		Student st= new Student("manoj","123");
		Student st1= new Student("mano","60");
		Student st2= new Student("jaya","83");
		Student st3=new Student("krishna","3");
		System.out.println(CalculateStudentGrade.calculateGrade(st));
		System.out.println(CalculateStudentGrade.calculateGrade(st1));
		System.out.println(CalculateStudentGrade.calculateGrade(st2));
		System.out.println(CalculateStudentGrade.calculateGrade(st3));
		

	}

}
