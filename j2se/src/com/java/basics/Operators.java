package com.java.basics;

public class Operators {

	public static void main(String[] args) {
//		int a=20;
//		int y=a++;
//		System.out.println("Post Increment : "+y);
//		int b=++a;
//		System.out.println("Pre Increment of 20 : "+b);
		int i=10;
		System.out.println("Addition increment : "+(i++ + ++i)); // i=10 then increment to 11 after that pre increment 12
		
		
		
		/* Bitwise Logical Operators */
		
		String binary[] = {
				"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
				};
				int a = 3; // 0 + 2 + 1 or 0011 in binary
				int b = 6; // 4 + 2 + 0 or 0110 in binary
				int c = a | b;
				int d = a & b;
				int e = a ^ b;
				int f = (~a & b)|(a & ~b);
				int g = ~a & 0x0f;
				System.out.println(" a = " + binary[a]);
				System.out.println(" b = " + binary[b]);
				System.out.println(" a|b = " + binary[c]);
				System.out.println(" a&b = " + binary[d]);
				System.out.println(" a^b = " + binary[e]);
				System.out.println("~a&b|a&~b = " + binary[f]);
				System.out.println(" ~a = " + binary[g]);
	}
}
