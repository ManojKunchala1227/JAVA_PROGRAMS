package PROGRAMS;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory 
{
	   ArrayList<Employee> ar= new ArrayList<>();
	   
	   Scanner s= new Scanner(System.in);
	   
	   public void addEmployee()
	   {
		   System.out.println("enter the em name: ");
		   String nm=s.nextLine();
		   System.out.println("enter the ds: ");
		   String ds=s.nextLine();
		   System.out.println("enter the em salary: ");
		   double sl=s.nextDouble();
		   
		   
		   
		   ar.add(new Employee(nm,ds,sl));
		   
		  // ar.add(new Employee("Bob","Developer",18000.98));
		  
		   
		  
		  
		  
	   }
	   public void displayAllEmployee()
	   {
		 
		   /*ar.forEach(x->System.out.println(x));*/
		   
		   for(int i=0;i<ar.size();i++)
		   {
			   System.out.println((i+1)+"." +ar.get(i));
		   }
		   
		  
		   
	   }
	   public void updateEmployee()
	   {
		   
		   
		   
		   System.out.println("Enter the employee name: ");
		   String nm1=s.nextLine();
		   
		   
		   
		   
		   for(int i=0;i<ar.size();i++)
		   {
			   if(ar.get(i).getName().contains(nm1))
			   {
				   System.out.println("Select the Employee salary:  ");
					 double sl=s.nextDouble();
					 
					 ar.get(i).setSalary(sl);
					 System.out.println("Salary updated successfully....");
					 
				   
			   }
			   else
			   {
				   System.out.println("Name not found");
			   }
			   
		   }
		      
		   
	   }
	   
	   public void deleteEmployee()
	   {
		   
		   
		   
		   
		   System.out.println("Enter the Employee name to remove : ");
		   String nm2= s.nextLine();
		   
		   for(int i=0;i<ar.size();i++)
		   {
			  if(ar.get(i).getName().contains(nm2))
			  {
				  System.out.println(ar.get(i).getName());
				  
				  ar.remove(i);
				  
				  
			  }
			  else
			  {
				  System.out.println("Name not found");
			  }
			   
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
//		   
//		   if(nm>=1 && nm<=ar.size() )
//		   {
//			   System.out.println("Employee removed"+ar.remove(nm-1));
//			   
//		   }
//		   else
//		   {
//			   System.out.println("Wrong option");
//		   }
		   
		   
		   
		   
		   
		   
		   
		   
	   }

}

