package Cumstom_Exception;

public class main1 
{
	
	  public static void get(String msg) {
		  
		  
		  if(msg.equalsIgnoreCase("mee"))
		  {
			  throw new CustomeException("custome");
		  }
	  
	  
	  }
	 
	

	
	public static void main (String args[])
	{
		main1.get("mee");
		
	}
}

