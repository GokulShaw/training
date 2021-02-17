package com.kctech.daytwo;


class Temp{
	StringBuilder a = new StringBuilder("MR");
	StringBuffer b = new StringBuffer("Shaw");


	void append(){
		a.append(" Shawarma ");
		b.append(" Arma ");
		System.out.println(a);
		System.out.println(b);
	}
	
	void insert(){
		a.insert(1, " GO ");
		b.insert(3, " JO ");
		System.out.println(a);
		System.out.println(b);
	}	

}


public class Buildnbuffer {
	public static void main (String [] args){
		Temp ae = new Temp();
		ae.append();
		ae.insert();
	}
		
}
