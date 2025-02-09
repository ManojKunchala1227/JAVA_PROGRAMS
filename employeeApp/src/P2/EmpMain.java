package P2;
import java.util.Scanner;
import P1.EmployeeData;
import P1.EmployeeSalary;

public class EmpMain {

	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		EmployeeData ed = new EmployeeData();
		EmployeeSalary es= new EmployeeSalary();
		
		System.out.println("Enter Employee ID=");
		ed.id=s.nextLine();
		System.out.println("Enter the Employee Name =");
		ed.name=s.nextLine();
		System.out.println("Enter Employee Basic Salary=");
		es.bsal=s.nextInt();
		System.out.println("Enter the Employee Total Salary");
		es.totalS=es.bsal+(0.93F*es.bsal)+(0.63F*es.bsal);
		ed.getEmployeeData();
		es.getEmployeeSalary();
		s.close();
		
		
		

	}

}
