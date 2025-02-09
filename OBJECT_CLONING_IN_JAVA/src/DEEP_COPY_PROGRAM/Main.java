package DEEP_COPY_PROGRAM;

public class Main 
{

	public static void main(String[] args) 
	{
		DeepCopy dc= new DeepCopy();
		dc.id=111;
		dc.name="Manoj";
		
		
		
		DeepCopy dc2= new DeepCopy();
		dc2.id=dc.id; //111
		dc2.name=dc.name; //Manoj
		
		
		System.out.println(dc+"   "+dc2);
		
		
		dc2.id=222;
		dc2.name="Miami";
		System.out.println(dc+"   "+dc2);
		
		
		System.out.println(dc.hashCode()+"   "+dc2.hashCode());
		
		
		
		
		
		

	}

}
