package com.kctech.javaassesment;

public class Javaasses7 {
	public Foo() {
		doSomething(); 
		} 
	public void doSomething() 
	{
		System.out.println("do something acceptable"); 
	} 
	} 
public class Bar extends Javaasses7 
{
	public void doSomething() 
	{ 
		System.out.println("yolo");
		Zoom zoom = new Zoom(this);
	} 
}
// here we didnt use  Zoom class with the object zoom.