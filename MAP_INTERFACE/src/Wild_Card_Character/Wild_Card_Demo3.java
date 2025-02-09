package Wild_Card_Character;
class Test<R,A>
{
	private R r;
	public void set( String a, String b) 
	{
		String r = a; //error [both are not compaitable]
	}
	
	public R get() 
	{
		return r;
	}
}
public class Wild_Card_Demo3 
{
   public static void main(String[] args) 
   {
      Test<String,String> test = new Test(); 
      test.set("Info","");
      System.out.println(test.get());
   }
}