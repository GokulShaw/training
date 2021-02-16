package com.kctech.dayone;
import java.util.Scanner;

public class Oddoreven {
	
      
	int num;
      
	
	public void check(){
		System.out.println("Enter number:");
		Scanner my = new Scanner(System.in);
	    int num = my.nextInt();
	   
			
		if (num%2 == 0){
			System.out.println("The given Number is Even");
		}
		else{
			System.out.println("The given number is Odd");
		}
	
	}
	public static void main(String [] args)
	{
	    
	    
		Oddoreven an = new Oddoreven();
		an.check();
		
	}
	
}
