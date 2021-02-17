package com.kctech.daytwo;

class A { 
    void add() 
    { 
      int a = 10;
      int b = 5;
       
       int c = a+b;
       System.out.println(c);
       
    } 
} 
  
 
class B extends A { 
	
    void add()
    { 
    	//super.add();
        int a = 21 ;
        int  b = 13 ;
        int c = a-b;
        
        System.out.println(c);
    } 
} 
  

public class Methodoverriding {
	
	public static void main(String [] args ){
		B obj = new B();
		
		obj.add();	
	}
	
}
