package com.kctech.daythree;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scannerfile {
	private static Scanner sc;

	public static void main(String[] args) {
		File dj = new File("/Users/d/Documents/workspace/newfolder/textone.txt");
		try {
			sc = new Scanner(dj);
			
			while (sc.hasNext()) 
			{
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
