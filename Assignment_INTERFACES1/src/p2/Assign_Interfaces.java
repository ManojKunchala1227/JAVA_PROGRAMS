package p2;
import java.util.*;
import p1.*;
public class Assign_Interfaces {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the values for X:");
		int x=s.nextInt();
		System.out.println("Enter the value for Y:");
		int y=s.nextInt();
	
		
		
		if (x>0 && y>0)
		{
			if(x==y)
			{
				System.out.println("Valus are Equal");
			}
			else
			{
				System.out.println("=====choice====");
				System.out.println("1.Greater Value \n 2. Smaller Value");
				int choice=s.nextInt();
				
				
				switch(choice)
				{
				case 1:
					Greater ob= new Greater();
					int res1= ob.comparable(x,y);
					
					System.out.println("Greater value :"+res1);
					break;
				case 2:
					Smaller bo = new Smaller();
					int res2= bo.comparable(x,y);
					System.out.println("Smaller value :"+res2);
					break;
					
					default:
						System.out.println("Invalid Choice");
				}
			}
		}
		else
		{
			System.out.println("Invalid Values...");
		}
		s.close();

	}

}
