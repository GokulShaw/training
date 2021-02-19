package com.kctech.daythree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapjava {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap <>();
		m.put(2, "Rahul");
		m.put(3, "Raina");
		m.put(41, "iyer");
		m.put(18, "kohli");
		
		System.out.println("Hash Map");
		
		for (Map.Entry i :m.entrySet()) {
			System.out.println(i.getKey() + " " + i.getValue());
		}
		System.out.println(" ");
		
		TreeMap <Integer, String> tm = new TreeMap<>();
		tm.put(7, "Thala");
		tm.put(12, "Yuvi");
		tm.put(99, "Dada");
		tm.put(10, "MasterBlaster");
		tm.put(19, "Wall");
		
		System.out.println("Tree Map");
		
		for(Map.Entry j : tm.entrySet()) {
			System.out.println(j.getKey() + " " + j.getValue());
		}
		
}
}