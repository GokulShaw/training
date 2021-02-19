package com.kctech.daythree;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.IOException;

public class Serializationjava {
	public static void main(String[] args) {
		
	
	
		try
        {    
			Employee obj = new Employee(102, "ritik");
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream("/Users/d/Documents/workspace/newfolder/text.txt"); 
            ObjectOutputStream out = new ObjectOutputStream(file);    
            // Method for serialization of object 
            out.writeObject(obj); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        }      
       catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
		
	}
}
