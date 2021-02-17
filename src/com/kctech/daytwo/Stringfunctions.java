package com.kctech.daytwo;

public class Stringfunctions {
	public static void main(String [] args){
		String s1 = "Shawarma ";
		String s2 = "Gokul";
		
		
		System.out.println(s1.length()); // to find the length of the string
		System.out.println(s2.length()); //"
		
		 String s3 = String.format("%d", 101);          // Integer value  
	     String s4 = String.format("%s", "Amar Singh"); // String value
	     System.out.println(s3);
	     System.out.println(s4);
	     
	     System.out.println(s1.toUpperCase()); // to upper case the string
	     System.out.println(s2.toLowerCase()); // "" to lower case
	     
	     System.out.println(s1.charAt(5)); // to find the character of the string based on index
	     System.out.println(s1.compareTo(s2)); //Compares two strings lexicographically
	     System.out.println(s1.compareToIgnoreCase(s2)); //Compares two strings lexicographically, ignoring case differences
	     
	     System.out.println(s1.concat(s2)); // appends  a string to the end of another string
	     
	     System.out.println(s1.contains("Shaw")); //checks whether a string contains a sequence of characters.
	     
	     System.out.println(s2.endsWith("l")); // 	Checks whether a string ends with the specified character(s)
	     
	     System.out.println(s1.equals(s2)); // Compares two strings. Returns true if the strings are equal, and false if not 
	     
	     System.out.println(s1.equalsIgnoreCase(s2)); // "" with ignoring cases
	     
	     System.out.println(s1.indexOf("a")); //Returns the position of the first found occurrence of specified characters in a string	
	     
	     System.out.println(s1.isEmpty()); // checks whether it is empty or not 
	     
	     System.out.println(s1.replace("a", "A"));//Searches a string for a specified value, and returns a new string where the specified values are replaced
	     
	     System.out.println(s1.toCharArray());
	     
	     String jn = String.join("-", "photo", "shop"); //  to join two strings
	     System.out.println(jn);
	     
	     
	     String Quotes = "Be a man";
	     String arr[] = Quotes.split(" ");
	     
	     System.out.println(arr[0]);
	     System.out.println(arr[2]);
	     
	     System.out.println(s1.startsWith("s"));
	     
	     char ch[] = s1.toCharArray();
	     
	     for(char c : ch){
	    	 System.out.println(c);
	     }
	       
	}
}
