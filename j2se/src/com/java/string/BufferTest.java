package com.java.string;

public class BufferTest {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Uday");
		StringBuilder sb1= new StringBuilder("Uday");
		System.out.println(sb.equals(sb1)); //check memory address
		System.out.println(sb.toString().equals(sb1.toString())); //Here true string conversion
		System.out.println();
		
	}

}
