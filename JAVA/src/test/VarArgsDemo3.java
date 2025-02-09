package test;

 class Test {
	// All commented codes are invalid
	
	  
	/*
	 * public void accept(float ...x, int ...y) { }
	 * 
	 * public void accept(int ...x, int y) { }
	 * 
	 * public void accept(int...x, int ...y) {}
	 */
	 

	public void accept(int x, int... y) // valid
	{
		System.out.println("x value is :" + x);
		for (int z : y) {
			System.out.println(z);
		}
	}
}



public class VarArgsDemo3 {

	public static void main(String[] args) 
	{
		Test t1 = new Test();
		t1.accept(100, 200,300,400,500);
	}
}






