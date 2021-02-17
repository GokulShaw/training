package com.kctech.daytwo;

public class Expeditionhandling {
	
	public static void main( String [] args)
	{
		try{
			int arr[] = new int [10];
			arr[11] = 90;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("AN error occurs in Array as ArrayIndexOutOfBoundsException ");
		}
		finally{
			System.out.println("Expeditional handling.");
		}
		
	}
}
