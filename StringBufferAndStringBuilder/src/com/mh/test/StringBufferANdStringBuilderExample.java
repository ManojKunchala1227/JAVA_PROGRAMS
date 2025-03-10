package com.mh.test;

public class StringBufferANdStringBuilderExample {

	
	
	public static void main(String[] args) {
		
		
		long startTime=System.currentTimeMillis();
		
		StringBuffer stringBuffer = new StringBuffer("Hello");
			
			for(int i=0;i<=5000;i++)
			{
			stringBuffer.append("  Java");
				
			}
			
		System.out.println("Time taken By String Buffer  ::"+(System.currentTimeMillis()-startTime)+"ms");
		
		
		
		
		long starttime=System.currentTimeMillis();
		
		StringBuilder stringBuider = new StringBuilder("Hello");
			
			for(int i=0;i<=5000;i++)
			{
				stringBuider.append("  Java");
				
			}
			
		System.out.println("Time taken By String Buffer  ::"+(System.currentTimeMillis()-starttime)+"ms");
		
		
		
	}
}
