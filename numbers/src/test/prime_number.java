package test;
import java.util.Scanner;
public class prime_number {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number :");
		int n=s.nextInt();
		if(n>=1)
		{
			for(int i=1;i<=n;i++)
			{
				
				int count=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}//InnerLoop
				if(count==2)
				{
					System.out.println(i+"");
				}
			}//Outer loop
		}
		s.close();

	}

}
