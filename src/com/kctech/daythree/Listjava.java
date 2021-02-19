package com.kctech.daythree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Listjava {
	public static void main(String[] args) {
		List <Integer> li = new ArrayList<Integer> (); //generics
		li.add(5);
		li.add(6);
		li.add(89);
		li.add(23);
		li.add(87);
		li.add(96);
		
		List <String> ls = new ArrayList<String>();
		ls.add("hi");
		
		List<Object>  show = new ArrayList<Object>();
		show.addAll(li);
		show.addAll(ls);
		System.out.println(show);
		
		//System.out.println(li);
		
		Collections.sort(li);
		
		//System.out.println(li);
		
		//for (int n : li) {
			//System.out.println(n);
		//}
	}
}
