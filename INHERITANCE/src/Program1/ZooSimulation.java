package Program1;

public class ZooSimulation 
{
	public static void main(String[] args)
	{
		Mammal m= new Mammal(true,"lion");
		
		m.makeSound();
		m.reproduce();
		m.nurseYoung();
		System.out.println(m);
		
		
		
		
		Bird b= new Bird(true, "eagle");
		
		b.makeSound();
		b.reproduce();
		b.buildNest();
		System.out.println(b);
		
		
		
	}

}
