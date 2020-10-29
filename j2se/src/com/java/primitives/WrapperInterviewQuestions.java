package com.java.primitives;

public class WrapperInterviewQuestions {
	
	public static void main(String[] args) {
		
		//Always store only true & false ignoring case. Other than that is saved as false
		Boolean b = new Boolean("true");
		Boolean b1 = new Boolean(true);
		System.out.println(b.equals(b1));
		
		Boolean b2 = new Boolean("True");
		Boolean b3 = new Boolean("tRue");
		System.out.println("b2 - "+b2+"| b3 - "+b3+". Result : "+b2.equals(b3));
		
		Boolean b4 = new Boolean("Hey");
		Boolean b5 = new Boolean("Bye");
		System.out.println("b4 - "+b4+"| b5 - "+b5+". Result : "+b4.equals(b5));
		
		Boolean b6 = new Boolean("FaLse");
		Boolean b7 = new Boolean(false);
		System.out.println(b6.equals(b7));
	}

}
