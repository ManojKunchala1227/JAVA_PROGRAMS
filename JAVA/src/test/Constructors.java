package test;


class Constructors { 
   public static void main(String[] args) { 
       new Aa(3); 
       new Ba(5, 6); 
       new Ba(6, 7).C(1, 2, 3); 
       new Ca(3, 3, 4).B(4, 5); 
       new Ca(1, 1, 1); 
   } 
} 
class Aa { 
   Aa(int i) {   
 print(i * 2);    
    } 
   void print(int i) {  
   System.out.print(i + " ");    
   } 
} 
class Ba extends Aa { 
   Ba(int j, int k) { 
       super(j); 
       print(k * 4); 
   } 
   void C(int j, int k, int l) { 
     print(j + k + l - 3);    
      } 
} 
class Ca extends Ba { 
   Ca(int j, int k, int l) { 
       super(j, k); 
       print(l - 3); 
   } 
   void B(int i, int k) {   
     print(i * 6);    
     } 
} 
