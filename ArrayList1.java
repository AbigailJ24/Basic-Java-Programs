package com.jprograms.java;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Jayakumar");//a[0]
		a1.add("Rajeswari");//a[1]
		a1.add("Abigail");//a[2]
		a1.add(3,"We are a family");
		System.out.println(a1);
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(1974);
		a2.add(1975);
		a2.add(2002);
		System.out.println(a2);
		
		a2.remove(1);
		System.out.println(a1);
		a2.remove(a2);
		System.out.println(a2);
		
		a1.set(3, "Kamalesh");
		System.out.println(a1);
		System.out.println(a1.get(1));
		a1.addAll(a1);
		System.out.println(a1);
		a1.retainAll(a2);
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println(a2);
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		
		
	
		

	}

}
