package Program1;

public class Bird  extends Animal
{
	boolean canFly;
	
	public Bird(boolean canFly, String species)
	{
		super(species);
		
		this.canFly=canFly;
		
		
	}
	@Override
	public void makeSound()
	{
		System.out.println("Bird is sounds");
		
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + "canFly="+ canFly+"]";
	}
	
	
	@Override
	
	public Bird reproduce()
	{
		System.out.println("Bird lay eggs as means of reproduction");
		
		return new Bird (true, "Unkonwn");
	}
	
	public void buildNest()
	{
		System.out.println("Bird building nests for their eggs ");
	}

}
