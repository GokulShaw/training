package com.kctech.daythree;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Deserializationjava {
	
	
	public static void main(String[] args) {
		
    try
    {    
         Employee oj = null;
    	
    	FileInputStream fe = new FileInputStream("/Users/d/Documents/workspace/newfolder/text.txt"); 
        ObjectInputStream in = new ObjectInputStream(fe); 
        
        Employee ob = (Employee)in.readObject(); 
          
          in.close(); 
          fe.close(); 
          
        System.out.println("Object has been deserialized "); 
        System.out.println(ob.empid); 
        System.out.println(ob.empname);

    } 
      
    catch(IOException ex) 
    { 
        System.out.println("IOException is caught"); 
    }
    
    catch(ClassNotFoundException ex) 
    { 
        System.out.println("ClassNotFoundException is caught"); 
    } 
    
}
}