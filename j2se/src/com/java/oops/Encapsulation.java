package com.java.oops;

public class Encapsulation {

	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setRollno(1);
		System.out.println(e.getRollno());
		e.getRollno();
	}
}


class Employee{
	
	private int rollno=10;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}