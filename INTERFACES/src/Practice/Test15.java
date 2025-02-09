package Practice;


class Animal1 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal1 {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    public void wagTail() {
        System.out.println("Dog wags its tail");
    }
}

class Cat extends Animal1 {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    public void purr() {
        System.out.println("Cat purrs");
    }
}

public class Test15 {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog();
        
        
        
        
        Animal1 animal2 = new Cat();
        
        
        

        // Upcasting: Assigning subclasses to superclass references
        animal1.sound(); // Output: Dog barks
        animal2.sound(); // Output: Cat meows

        // Downcasting: Converting superclass references back to subclass references
        Dog dog = (Dog) animal1;
        Cat cat = (Cat) animal2;

        // Accessing subclass-specific methods
        dog.wagTail(); // Output: Dog wags its tail
        cat.purr();    // Output: Cat purrs

        // Attempting to downcast to incorrect subclass type
        // This will result in ClassCastException at runtime
        // Dog dog2 = (Dog) animal2; // Throws ClassCastException
    }
}
