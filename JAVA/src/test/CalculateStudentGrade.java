package test;

public class CalculateStudentGrade
{
	public static StudentGrade calculateGrade (Student st)
	{
		char grade;
		int marks =Integer.parseInt(st.getMarks());
		
		if(marks>90)
		{
			grade='A';
			
		}
		else if (marks>=75)
		{
			grade='B';
		}
		else if (marks>=60)
		{
			grade='C';
		}
		else
		{
			grade='C';
		}
		
		
		
		StudentGrade sg= new StudentGrade(st,grade);
		
		return sg;
		
		
		
		
		
	}
	

}
