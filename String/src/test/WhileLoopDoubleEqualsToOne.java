package test;

public class WhileLoopDoubleEqualsToOne {

	static int count=1;
	public static void main(String[] args) 
	{
		while(count<=15)
		{
			System.out.println(count);
			System.out.println(count%2==1?"****":"+++++");
			++count;
		}//end while loop
	}//end main method

}
