package Practice;

interface Adda
{ 
 int add(int b); 
// int add(int a, int b); 
}
public class FunctionalInterface 
{ 
	  
	public static void main(String[] args) { 
		  int a = 21; 
		  Adda add = b -> b+b; 
		  System.out.println(add.add(a)); 
		 }
		} 
