package com.java.primitives;

public class InterviewQuestions {

	public static void main(String[] args) {
		 Integer a = 500;
		    long b = 500;
		    System.out.println(a == b); //this is because the first comparison uses unboxing i.e a.intValue() == b
		    System.out.println(a.equals(b));
	}
}
