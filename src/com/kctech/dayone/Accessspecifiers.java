package com.kctech.dayone;

public class Accessspecifiers {
	public void method1(){
		System.out.println("this is public, can be accessed anywhere.");
	}
	private  void method2(){
		System.out.println("this is private, accessed within the class.");
	}
	protected  void method3(){
		System.out.println("this is protected, accessed within the class and outside by a sub class.");
	}
	void method4(){
		System.out.println("this is default, when access level is not specified.");
	}
	
	public static void main(String [] arg){
		Accessspecifiers ca = new Accessspecifiers();
		ca.method1();
		ca.method2();
		ca.method3();
		ca.method4();
	}
}
