package p2;
import java.util.Scanner;
import p1.GreaterValue;
import p1.SmallerValue;
public class DemoMethods {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value-1");
		int v1 =s.nextInt();
		System.out.println("Enter the valu-2");
		int v2 =s.nextInt();
		if (v1>0 && v2>0)
		{
			if (v1==v2)
			{
				System.out.println("Enterd values are equal");
			}
			else
			{
				System.out.println("=====choice===");
				System.out.println("1.GreaterVlaue\n2.SmallerValue");
				int choice=s.nextInt();
				switch(choice)
				{
				case 1: 
					GreaterValue gv= new GreaterValue();
					int res1=gv.greater(v1,v2);
					System.out.println("Greater Value="+res1);
					break;
				case 2:
					SmallerValue sv= new SmallerValue();
					int res2=sv.Smaller(v1,v2);
					System.out.println("Smaller Value"+res2);
					break;
					default:
					
					System.out.println("Invalid choice");
				}
				
			}
			
		}
		else 
		{
			System.out.println("Invalid values");
		}
		
		
		
		
		

	}

}
