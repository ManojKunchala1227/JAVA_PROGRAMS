package test;


class Addition 
{
   public Addition()
   {
	   
	  this(10); 
	  System.out.println("No Argument Constructor");
   }
   
   public Addition(int x)
   {
	   this(100,200);
	   System.out.println("One Argument Constructor :"+x);
	   
   }
   public Addition(int x, int y)
   {
	   super();
	   System.out.println("Two Argument Constructor :"+x+":"+y);
   }
   
   {
	  
		System.out.println("Instance Block");
   }
}


public class Constructor_Overloading {

	public static void main(String[] args) {
		new Addition();

	}

}
