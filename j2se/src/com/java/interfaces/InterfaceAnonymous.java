package com.java.interfaces;

abstract class TestAno{
	abstract String print();
	
	public static void main(String[] args) {
	}
}
public class InterfaceAnonymous {

	
	public static void main(String[] args) {
		TestAno a = new TestAno() {
			
			@Override
			String print() {
				return "Uday";
				
			}
			
		};
		System.out.println(a.print());
	}
}
