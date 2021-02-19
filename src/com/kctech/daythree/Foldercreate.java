package com.kctech.daythree;
import java.io.File;


public class Foldercreate {
	public static void main(String[] args) {
		File fle = new File("/Users/d/Documents/workspace/newfolder");
		boolean check = fle.exists();
		System.out.println(check);
		
		if (check == false) {
			fle.mkdir();
		}
	}
}
