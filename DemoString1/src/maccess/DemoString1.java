package maccess;

public class DemoString1 {

	public static void main(String[] args)
	{
		//Strung Literal Process
		String s1="java";
		//New Operator Process
		String s2= new String ("Hyd");
		
		System.out.println("****S1****");
		int len1= s1.length();
		char ch1=s1.charAt(2);
		System.out.println("data in s1:"+s1.toString());
		System.out.println("Lenght of s1  :"+len1);
		System.out.println("Char at Index 2 :"+ch1);
		
		System.out.println("*****S2****");
		int len2= s2.length();
		char ch2=s2.charAt(1);
		System.out.println("Data in s2  :"+s2.toString());
		System.out.println("Length of s2  : "+len2);
		System.out.println("Char at index 1  :" +ch2);
		
	}

}
