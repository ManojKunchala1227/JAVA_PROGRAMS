package test;
import java.sql.*;
import java.util.*;
public class DBCon1 {

	public static void main(String[] args) 
	{
		
		Scanner s= new Scanner(System.in);
		try(s;)
		{
			
			try
			{
				System.out.println("enter the id: ");
				int iD=Integer.parseInt(s.nextLine());
				
				System.out.println("enter the name: ");
				String nm=s.nextLine();
				
				System.out.println("enter the City: ");
				String cty=s.nextLine();
				
				System.out.println("enter the Mail id: ");
				String md=s.nextLine();
				
				System.out.println("enter the Phone no: ");
				String phNo=s.nextLine();
				
				Class.forName("oracle.jdbc.driver.OracleDriver");// Loading driver
				Connection con = DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:orcl","ADVJAVA","123"); // Creating Connection
				
				Statement stm=con.createStatement(); // preparing statement
				
				int k=stm.executeUpdate("insert into customer61 values"
						+ "("+iD+",'"+nm+"','"+cty+"','"+md+"',"+phNo+")");
				
				if(k>0)
				{
					System.out.println("Details added Successfully.........");
				}
				
				
			}
			catch(Exception e)
			{
				e.toString();
			}
			
		}// try with resource
		
		
	}

}
