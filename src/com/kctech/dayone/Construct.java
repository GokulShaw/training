package com.kctech.dayone;

public class Construct {
	int a ;
	

	public Construct(){
		a = 25;
	}
	public Construct(int n){
		a = n;
	}
	public Construct (double d){
		a = (int) d;
	}
	public static void main (String[] args){
		Construct obj = new Construct(2.7);
		System.out.println(obj.a);
		
	}
}
