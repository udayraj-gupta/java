package com.java.generis;

public class GenericBoundedType {

	public static void main(String[] args) {
		NumericFunc<Integer> integer = new NumericFunc<>(10);
		NumericFunc<Double> doublee = new NumericFunc<>(10.0);
		System.out.println(integer.absEqual(doublee));
		
	}
	
}
