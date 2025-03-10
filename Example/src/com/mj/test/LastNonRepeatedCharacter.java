package com.mj.test;

public class LastNonRepeatedCharacter {

	public static void main(String[] args) 
	{
	
		
		String name="Software Service";
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			
			if(name.charAt(i)!=' ')
			{
				boolean Boolean=true;
				for(int j=0; j<name.length();j++)
				{
					if(name.charAt(i)==name.charAt(j) && i!=j)
					{
						Boolean = false;
						break;
						
					}
					
					
					
				}
				if(Boolean)
				{
					System.out.println(name.charAt(i));
					break;
				}
				
			}
			
		}

	}

}
