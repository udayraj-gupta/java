package com.java.basics;

class Emp{
	int eid; // This are different for object to object
	int salary;
	static String ceo; //Memory is created at class loader & available through out the same value.
	
	static {
		ceo="Larry";
		System.out.println("Static block");
	}
	
	public Emp() {
		eid=1;
		salary=300;
		ceo="Larry";
		System.out.println("Constructor called");
	}
	
	public void show() {
		System.out.println("EID : "+eid+" salary : "+salary+" CEO : "+ceo);
	}
}

public class StsticClass {
	
	public static void main(String[] args) {
		Emp uday = new Emp();
		uday.eid=2;
		uday.salary=1000;
		Emp.ceo="changed";
		
		Emp rahul = new Emp();
		rahul.eid=3;
		rahul.salary=2000;
		Emp.ceo="modified";
		
		uday.show();
		rahul.show();
	}

}
