package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Dog 
{
      private String name;
      Dog(String n) 
      {
           name = n;
      }

	public String getName()
	{
		return this.name;
	}

    public String toString()
	{
		return this.name;
	}
}
public class LinkedListDemo5
{
       public static void main(String[] args)
       {
             List<Dog> d = new LinkedList<>();
             Dog dog = new Dog("Tiger");
             d.add(dog);
             d.add(new Dog("Tommy"));
             d.add(new Dog("Rocky"));

             Iterator<Dog> i3 = d.iterator();
		    i3.forEachRemaining(x -> System.out.println(x.getName().toUpperCase())); //java 8      


             System.out.println("size " + d.size());
             System.out.println("Get 1st Position Object " + d.get(1).getName());
             
            
        }
}