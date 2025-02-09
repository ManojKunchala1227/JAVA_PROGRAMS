package SHALLOW_COPY_PROGRAM1;

public class Main 
{

	public static void main(String[] args) 
	{
		Shallow_Copy sc= new Shallow_Copy();
		
		
		sc.id=111;
		sc.name="Manoj";
		
		System.out.println(sc);
		
		
		Shallow_Copy sc2=sc;
		
		
		sc2.id=222;
		sc2.name="Miami";
		
		System.out.println(sc);
		
		System.out.println(sc2);
		
		
		System.out.println(sc.hashCode());
		System.out.println(sc2.hashCode());
		
		
		
		
		

	}

}
