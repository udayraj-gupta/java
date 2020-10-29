package com.java.string;

public class StringManipulationHashCode {

	
	public static void main(String[] args) {
		String s1 ="uday";
		String s2 = new String("Shreyas");
		String s3=s1.intern();
				
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("s1 literal refer : "+s3.hashCode());
		s3="Shreyas";
		System.out.println("s2 obj refer : "+s3.hashCode());
		
		
		
	}
	
}
