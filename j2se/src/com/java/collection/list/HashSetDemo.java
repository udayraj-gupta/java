package com.java.collection.list;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<Integer> a = new HashSet<>();
		a.add(10);
		a.add(20);
		a.add(30);
		
		Set<Integer> b = new HashSet<>();
		b.add(11);
		b.add(21);
		b.add(31);
		System.out.println("A Element : "+a);
		a.addAll(b);
		System.out.println("AddAll A : "+a);
		
		 b = new HashSet<>();
		 b.add(10);
		 b.add(21);
		 b.add(51);
		 
		 System.out.println("A Element : "+a);
		 System.out.println("B Element : "+b);
		 a.retainAll(b); //keep the matching element found in b rest deleted.
		 System.out.println("RetainAll B into A : "+a);
		 
		 a.add(27);
		 a.containsAll(b);
		 System.out.println("A : "+a);
		 System.out.println(a);
		
		
		
		
	}

}
