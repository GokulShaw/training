package com.kctech.daythree;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet <Integer> val = new HashSet <>();
		System.out.println(val.add(96));
		System.out.println(val.add(89));
		System.out.println(val.add(89));
		System.out.println(val.add(78));
		System.out.println(val.add(798));
		
		for (int i : val) {
			System.out.println(i);
		}
	}
}
