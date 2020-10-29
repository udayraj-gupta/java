package com.java.string;

import java.util.Arrays;

public class StringImpMethods {

	public static void main(String[] args) {
		String s1= "uday";
		String s2 = new String("uday");
		System.out.println("Add Check : "+(s1==s2));	//Address check
		System.out.println("Value Check : "+s1.equals(s2));	//Value check
//When the intern() method is executed then it checks whether the String equals to this String Object is in the pool or not.
		s2=s2.intern();
		System.out.println(s1==s2);
		System.out.println("OG S1 String : "+s1.hashCode());
		System.out.println("S2 String : "+s2.hashCode());
		s1=s1.concat(" G");
		System.out.println("Modified S1 String : "+s1.hashCode());
		String u="";
		System.out.println(u.isEmpty());
		
		System.out.println("***********************************************************");
		char[] pass=new char[] {'u','d','a','y'};
		System.out.println(pass);
		System.out.println(""+pass);
		Arrays.fill(pass,'*');
		System.out.println(pass);
	}
}
