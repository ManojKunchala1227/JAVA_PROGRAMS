package test;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=4;
		 int result=1;
		 
		 for(int i=1;i<=n;i++)
		 {
			 result= result*i;
		 }
		 System.out.println("The factorial of  :" +n+  "  is   :" +result);
		
		s.close();

	}

}
