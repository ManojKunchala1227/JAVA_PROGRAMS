package com.mj.test;

public class FirstNonRepeatedCharacter 
{
	


	public static void main(String[] args) 
	{
		 
		
		String name="Software Service";
	
		
		//first Non repeated character
		for(int i=0; i<name.length();i++)
		{
			if(name.charAt(i)!=' ')
			{
				//boolean Boolean = true;
				int count=0;
				
				
				for(int j=i+1; j<name.length();j++)
				{
					//System.out.println(name.charAt(i)  +" :: "+name.charAt(j));
					if(i!=j && name.charAt(i)==name.charAt(j) )
					{
						
						//Boolean =false;
						count++;
						
						
					}
				//	System.out.println(name.charAt(i));
					
				}
				
				if(count==1)
				{
					System.out.println(name.charAt(i));
				
					
				}
				
					
				
			}
			
			
		}
		
		
		
		
		// last non repeated character
		
//		for(int i=name.length()-1;i>0;i--)
//		{
//			if(name.charAt(i)!=' ')
//			{
//				boolean Boolean=true;
//				for(int j=0;j<name.length();j++)
//				{
//					if((i!=j) && name.charAt(i)==name.charAt(j))
//							{
//						//System.out.println(name.charAt(i));
//						Boolean=false;
//						break;
//						
//							}
//				}
//				if(Boolean)
//				{
//					System.out.println(name.charAt(i));
//					break;
//				}
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
