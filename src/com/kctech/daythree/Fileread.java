package com.kctech.daythree;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {
	public static void main(String[] args) {
		try {
			FileReader cv = new FileReader("/Users/d/Documents/workspace/newfolder/textone.txt");
			
			int output = cv.read();
			while(output != -1) {
				System.out.print((char) output);
				output = cv.read();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
