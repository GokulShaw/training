package com.kctech.daytwo;

public class Methodoverloading {
	static public int add(int a, int b)
	{
		return a+b;
	}	
	static public double add(double a, double b, double c)
	{
		return a+b+c;
		
	}
	public static void main( String [] args){
		
		System.out.println(add(2,2));
		System.out.println(add(20.5,15.6,45.6));
	}
}
