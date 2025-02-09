package Program1;

public class Mammal extends Animal
{
	public boolean hasFur;
	
	public Mammal(boolean hasFur, String species)
	{
		super(species);
		
		this.hasFur=hasFur;
		
		
	}
	@Override
	public void makeSound()
	{
		System.out.println("Generic animal sounds");
		
	}

	@Override
	public String toString() {
		return "Animal [species=" + species + "hasFur="+ hasFur+"]";
	}
	
	
	@Override
	
	public Mammal reproduce()
	{
		System.out.println("Mammal give birth to live young");
		
		return new Mammal (true, "Unkonwn");
	}
	
	public void nurseYoung()
	{
		System.out.println("mammals nursing their young");
	}
	

}
