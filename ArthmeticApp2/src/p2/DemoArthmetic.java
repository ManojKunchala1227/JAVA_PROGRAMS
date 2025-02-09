package p2;
import java.util.Scanner;
import p1.Addition;
import p1.Subtraction;
import p1.Multiplecation;
import p1.Division;
import p1.ModuloDivision;
public class DemoArthmetic {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value-1");
		int A1=s.nextInt();
		System.out.println("Enter the Value-2");
		int B1=s.nextInt();
		
		Addition ad= new Addition();
		int Result1=ad.add(A1,B1);
		System.out.println("Addition="+Result1);
		Subtraction sb= new Subtraction();
		int Result2=sb.sub(A1,B1);
		System.out.println("Subtraction="+Result2);
		Multiplecation ml = new Multiplecation();
		int Result3=ml.Mul(A1,B1);
		System.out.println("Multiplecation="+Result3);
		Division dv =new Division();
		int Result4=dv.Div(A1,B1);
		System.out.println("Divison="+Result4);
		ModuloDivision md =new ModuloDivision();
		int Result5=md.ModDiv(A1,B1);
		System.out.println("ModuloDivision="+Result5);
		s.close();

	}

}


