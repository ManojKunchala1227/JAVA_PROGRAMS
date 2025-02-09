package test;

 class Dog { 
	 private String dogColor; 
	 private double dogHeight; 
	 private String dogName; 
	 
	 public Dog(String dogColor, double dogHeight, String dogName) { 
	  super(); 
	  this.dogColor = dogColor; 
	  this.dogHeight = dogHeight; 
	  this.dogName = dogName; 
	 } 
	 
	  
	  
	  
	 public void setDogHeight(double dogHeight) 
	 { 
	  this.dogHeight = dogHeight; 
	 } 
	 
	 
	 
	 @Override 
	 public String toString() { 
	  return "Dog [dogColor=" + dogColor + ", dogHeight=" + dogHeight + ", dogName=" + dogName + "]"; 
	 } 
	 
	  
	  
	} 



public class ParameterizedConstructor { 
 
 public static void main(String[] args)  
 { 
     Dog d1 = new Dog("Grey", 3.5, "Tiger"); 
     System.out.println(d1); 
      
      
     Dog d2 = new Dog("Black", 4.4, "Tommy"); 
     System.out.println(d2); 
 } 
 
}
	 
	 
	