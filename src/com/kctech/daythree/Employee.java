package com.kctech.daythree;

import java.io.Serializable;

public class Employee implements Serializable{
		public int empid; 
	    public String empname;
    
	public Employee(int empid ,String empname) {
		this.empid = empid;
		this.empname = empname;
	}
	
}
