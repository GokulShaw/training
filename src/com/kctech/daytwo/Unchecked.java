package com.kctech.daytwo;

public class Unchecked {

	
	public static void main(String[] args) {
		
		try{
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("You can divide a number with zero");
		}
	}
}
