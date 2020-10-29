package com.java.generis;

public class NumericFunc<T extends Number> {
	
	T num;
	
	public NumericFunc(T ob) {
		this.num=ob;
		System.out.println("-> "+this.num);
	}
	
	double square() {
		return num.intValue()*num.doubleValue();
	}
	
	boolean absEqual(NumericFunc<?> ob) {
		if(Math.abs(num.intValue())==Math.abs(ob.num.doubleValue())) {
			System.out.println(Math.abs(num.intValue()));
			System.out.println(Math.abs(ob.num.doubleValue()));
			return true;}
		return false;
	}

}
