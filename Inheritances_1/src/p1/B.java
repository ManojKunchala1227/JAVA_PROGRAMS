package p1;
public class B extends A
{
	public int b;
	public String name2;
	public void get2()
	{
		System.out.println("*****C-Class******");
		System.out.println("The value of Int :"+b);
		System.out.println("the value of String :"+name2);
		
	}//Method body of C-Calss
	{
		System.out.println("*****C-Class Instace-Block******");
		System.out.println("The value of Int :"+b);
		System.out.println("The value of String :"+name2);
	}//Instance-Block of C-Class
	

}
