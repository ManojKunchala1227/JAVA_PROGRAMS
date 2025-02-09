package TreeSet_Class;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet<Dog> ts = new TreeSet<>();
		ts.add(new Dog(2));
		ts.add(new Dog(3));
		ts.add(new Dog(1));
		
		System.out.println(ts);
	}

}

class Dog implements Comparable<Dog>
{
	private int id;

	public Dog(int id) 
	{
		super();
		this.id = id;
	}

	@Override
	public int compareTo(Dog d2) 
	{
		return this.id - d2.id;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + "]";
	}
	
	
	
}