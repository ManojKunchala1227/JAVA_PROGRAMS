package com.mj.sumofindividualdigits;

public class sumOfIndividualDigits {

	public static void main(String[] args) 
	{
		int value=2345;
		
		
		int tem=1;
		int sum=0;
		while(value>0)
		{
			
		tem=value%10;
		sum=sum+tem;
		value=value/10;
		
		
		
		
		}
		System.out.println(sum);

	}

}
