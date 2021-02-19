package com.kctech.daythree;

import java.util.Comparator;

public class Comparejava {
	
	int age;
	
	Comparejava(int age)
	{
		this.age=age;
	}
}

class sample implements Comparator <Comparejava>
{

	@Override
	public int compare(Comparejava o1, Comparejava o2)
	{
		if(o1.age>o2.age)
		// TODO Auto-generated method stub
		return 0;
	
		else
			return 1;
	}
	
}