package com.kctech.dayone;

public class Controlstatementg {
	public void ifElse(){
		int height = 180;
		if (height >180){
			System.out.println("The candidate is not eligible.");
		}
		else{
			System.out.println("The candidate is eligible.");
		}
	}
	
	public void forloop(){
		
		for(int i=0; i<10 ; i++){
			System.out.println(i);
		}
	}
	
	public void whileloop(){
		
		int i = 1;
		 while (i<=12){
			 System.out.println(i);
			 i++;
		 }
	}
	
	public void dowhileloop(){
		
		int i = 0;
		do {
		  System.out.println(i);
		  i++;
		}
		while (i < 5);
	}
	
	public void switchloop()
	{
		String name="Gokul";
		
		switch(name)
		{
			case "virat" : System.out.println("i'm a cricketer");
			break;
			case "Gokul" : System.out.println("I'm a software Engineer");
			break;
			default : System.out.println("He is nothing");
			break;
		}
	}
	
	public void continueloop(){
		for(int i = 0; i<5; i++ ){
			if (i == 2){
				continue;
			}
			System.out.println(i);
		}
	}
	


	public static void main (String [] args)
	{
		Controlstatementg de = new Controlstatementg();
		de.ifElse();
		de.forloop();
		de.whileloop();
		de.dowhileloop();
		de.switchloop();
		de.continueloop();
		
	}


}

