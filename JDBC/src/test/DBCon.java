package test;
import java.sql.*;
public class DBCon {

	public static void main(String[] args) 
	{
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");  //Loading Driver
			Connection con=DriverManager.getConnection
					("jdbc:oracle:thin:@localhost:1521:orcl","ADVJAVA","123"); //creating Connection
			
			Statement stm= con.createStatement(); //Preparing Statement
			
			ResultSet rs=stm.executeQuery("select*from customer61"); //Executing query 
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+
									rs.getString(2)+"\t"+
									rs.getString(3)+"\t"+
									rs.getString(4)+"\t"+
									rs.getLong(5));
			}
			con.close();
			
		}
		catch(Exception e)
		{
			e.toString();
			
		}

	}

}
