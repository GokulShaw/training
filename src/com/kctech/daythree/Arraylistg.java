package com.kctech.daythree;
import java.util.ArrayList;



public class Arraylistg {
	public static void main(String[] args) {
		ArrayList <Integer> ad = new ArrayList<Integer>() ;
		
		ad.add(154);
		ad.add(263);
		ad.add(789);
		ad.add(475);
		ad.add(263);
		ad.add(789);
		 System.out.println(ad);
		 System.out.println(ad.size());
		 System.out.println(ad.contains(263));
		 
		 
		 System.out.println();
		 
		 System.out.println(ad.get(4));
		 System.out.println(ad);
		 
		 System.out.println(ad.remove(3));
		 System.out.println(ad);
		 
		 ad.add(4, 253);
		 System.out.println(ad);
		
	}
}
