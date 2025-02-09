package test;



public class Exam { 
 int x; 
 int y; 
 Exam() 
 { 
  x = 10; 
  y = 20; 
 } 
 Exam(Exam exam) 
 { 
  System.out.println(exam.x+this.x+exam.y+this.y); 
 } 
 public static void main(String[] args) { 
  Exam e1 = new Exam(); 
  e1.x = 20; 
  new Exam(e1); 
 } 
} 
