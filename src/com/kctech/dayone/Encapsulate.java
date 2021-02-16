package com.kctech.dayone;

public class Encapsulate {
	 private int a;
	 
	 public void setmethod(int a)
	 {
		 this.a=a; 
	 }
	 
	 public void getMethod ()
	 {
		 if (a%2 ==0){
			 System.out.println("The Given Number is Even");
		 }
		 else{
			 System.out.println("The Given NUmber is Odd");
		 }
		 

	 }
}
