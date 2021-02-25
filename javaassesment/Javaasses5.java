package com.kctech.javaassesment;

import java.util.Arrays;

public class Javaasses5 {
	String str1 = "home";
	String str2 = "mohe";
	
	public void checkanagram(){
		if (str1.length() != str2.length()) {  
	            System.out.println("Both the strings are not anagram");  
	        }
		else 
		{
			//Converting both the arrays to character array
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			 //Sorting the arrays using in-built function sort ()  
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if (Arrays.equals(string1, string2)){
				System.out.println("It is a Anagram");
			}
			else
			{
				System.out.println("It is not a Anagram");
			}
		}
		
	}
	public static void main(String[] args) {
		Javaasses5 obj = new Javaasses5();
		obj.checkanagram();
	}
}
