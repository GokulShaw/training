package com.kctech.daytwo;

class one 
{ 
    public void printone() 
    { 
        System.out.println("one"); 
    } 
} 
  
class two extends one 
{ 
    public void printtwo() 
    { 
        System.out.println("two"); 
    } 
} 
  
class three extends two 
{ 
    public void printthree() 
    { 
        System.out.println("three"); 
    } 
} 
  

public class Inherit 
{ 
    public static void main(String[] args) 
    { 
        three g = new three(); 
        g.printone(); 
        g.printtwo(); 
        g.printthree(); 
    } 
}
	


