package test;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number :");
		int n=s.nextInt();
		
		if(n>1)
		{
			for(int i=1;i<n;i++)
				
			{
				if(i%2==0)
				{
					System.out.println(i+"");
				}
			}
		}
		s.close();

	}

}
