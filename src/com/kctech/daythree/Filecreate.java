package com.kctech.daythree;
import java.io.File;
import java.io.IOException;

public class Filecreate {
	public static void main(String[] args) {
		File fl = new File("/Users/d/Documents/workspace/newfolder/text.txt");
		boolean check = fl.exists();
		System.out.println(check);
	
		if ( check == false ) {
			try {
				fl.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
