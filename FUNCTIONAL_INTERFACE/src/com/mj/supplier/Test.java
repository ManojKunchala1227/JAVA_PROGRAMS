package com.mj.supplier;

public class Test 
{
	public static void main(String[] args) {
		
//		Long account=(long)(Math.random()*10000000000L);
//		System.out.println(account);
//		 while (account < 1000000000L) 
//         {
//			 account = (long)(Math.random() * 10000000000L); // Regenerate if it's less than 10 digits
//         }
//		 System.out.println(account);

		
		
		String account = "";
		
		for(long i=1; i<11;i++)
		{
			account = account+(long) (Math.random()*10);
			
		}
		System.out.println(Long.parseLong(account));
		
		
//		Long account= (long) (Math.random()*100000000000L);
//		//System.out.println(account);
//		 if(account.toString().length()==10)
//		 System.out.println(account);
//		 
//		 throw new NullPointerException("The account number must have exactly 11 digits.");
		
	}

}
