package test;

class Students
{
	final int  studentId = 100;
	final String studentName = "Scott";
	
	public void show()
	{
		
		
		System.out.println(studentId);
		System.out.println(studentName);
	}
	
}

public class VariableShadow {

	public static void main(String[] args)
	{
		new Students().show();

	}

}
