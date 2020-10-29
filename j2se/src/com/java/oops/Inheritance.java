package com.java.oops;

public class Inheritance {

	public static void main(String[] args) {
		Animal c = new Horse();
	
		
		c.eat();
		//a.buck();  // can't call parent it's child method
	}
	
}
class Animal{
	public void eat() {
		System.out.println("Animal eats");
	}
	public Animal(){
		System.out.println("Animal Constructor");
	}
}

class Horse extends Animal{
	
	public Horse() {
		System.out.println("Horse constructor");
	}
	public void eat() {
		System.out.println("Horse is eating");
	}
	
	public void buck() {
		System.out.println("Horse Bucks");
	}
}
