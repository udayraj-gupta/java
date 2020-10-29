package com.java.primitives;

public class Primitives {
	
	public static void main(String[] args) {
		char special='(';
		byte b=4;
		byte c=4;
		System.out.println(b==c);
		c=(byte) 130;
		System.out.println(c);
		
		int num =10_000;
		System.out.println(num);
		
		Integer i=10;

		System.out.println("int : "+i.intValue());
		System.out.println("double : "+i.doubleValue());
		System.out.println("Comparision : "+(i.intValue()==i.doubleValue()));
		byte uday=127;
		double raj=10.0;
		System.out.println(uday==raj);	//Comparing byte with double.
		
		
		char a='a';
		System.out.println(a==97); //Can compare char with numeric but it will check ASCII value
		
		int x=11;
		int y=41;
		x^=y;
		System.out.println(x);
		
	}

}
