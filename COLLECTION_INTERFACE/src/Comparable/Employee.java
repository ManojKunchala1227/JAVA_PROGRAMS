package Comparable;

record Employee (int empId, String empName) implements Comparable<Employee>
{

	@Override
	public int compareTo(Employee e)  // Comparable is checking the the class variable objects is there or no 
										// The comparable interface is not take the another class or interfaces variable as a parameter objects
	{
		
		return empName.compareTo(e.empName);
	}
	



}
