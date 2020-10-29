package com.java.exceptions;

public class ExceptionInterview {
	
	public static void main(String[] args) {
		ExceptionInterview e = new ExceptionInterview();
		e.sum();
		System.out.println("Completed");
	}
	
	int sum() {
		int res=0;
		try {
		res=2+3;
		System.out.println("-"+res);
		return res; // After finally get executed then this will return.
	}finally {
		System.out.println("Result");
	}
	}

}
