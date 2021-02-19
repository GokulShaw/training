package com.kctech.daythree;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Filewrite {
	public static void main(String[] args) {
		File bot = new File("/Users/d/Documents/workspace/newfolder/textone.txt");
		boolean checking = bot.exists();
		System.out.println(checking);
		if (checking == false) {
			try {
				bot.createNewFile();
				
				FileWriter wr = new FileWriter(bot);
				wr.write("My name is Gokul");
				wr.flush();
				wr.close();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}
