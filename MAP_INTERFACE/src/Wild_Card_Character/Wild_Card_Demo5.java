package Wild_Card_Character;
class Fruit    
{
}
class Apple extends Fruit   //Fruit is super, Apple is sub class
{
	@Override
	public String toString()
	{
		return "Apple";
	}
}

class Basket<E>   // E is fruit type 
{
	private E element;  	
	public void setElement(E element) //Fruit element = new Mango();
	{
		this.element = element;
	}	

	public E getElement() // public Fruit getElement{}
	{
		return this.element;		
	}
}

public class Wild_Card_Demo5
{
	public static void main(String[] args) 
	{
		Basket<Fruit> b = new Basket<>();
		b.setElement(new Apple());

		Apple x = (Apple) b.getElement();	
		System.out.println(x);

       
        Basket<Fruit> b1 = new Basket<>();
		b1.setElement(new Mango());
		Mango y = (Mango)b1.getElement();	
		System.out.println(y);
		
	}
}
class Mango extends Fruit
{
	@Override
	public String toString()
	{
		return "Mango";
	}
}
