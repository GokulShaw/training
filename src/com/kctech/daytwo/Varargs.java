package com.kctech.daytwo;


class Calc{
	public int add(int ...n)// {4, 8, 12, 515, 12, 1022}
	{
		int sum = 0;
		for(int i:n) //for each loop
		{
			sum =sum+i;
		}
		return sum;
	}
}
public class Varargs {

	public static void main(String [] args){
		Calc obj = new Calc();
		System.out.println(obj.add(4, 8, 12, 515, 12, 1022));
	}
}
