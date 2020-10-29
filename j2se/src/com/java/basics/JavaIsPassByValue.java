package com.java.basics;

public class JavaIsPassByValue {

/* Here is what James Gosling (et al.) actually says: */

/*The Java programming language does not pass objects by reference;
 *  it passes object references (mem address) by value. Because two copies of the same reference refer to the same actual object, 
 *  changes made through one reference variable are visible through the other. There is exactly one parameter passing mode
 *   -- pass by value -- and that helps keep things simple.*/
	
//	https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
	//Memory address is passed to method
	public static void main(String[] args) {
	    Dog aDog = new Dog("Max");
	    Dog oldDog = aDog;
	    System.out.println(oldDog.toString());
	    // we pass the object to foo
	    System.out.println("Mem Add before method : "+aDog.toString());
	    foo(aDog);
	    System.out.println("Mem Add after method : "+aDog.toString());
	    // aDog variable is still pointing to the "Max" dog when foo(...) returns
	    System.out.println("Max check : "+aDog.getName().equals("Max")); // true
	    System.out.println("Fifi check changed OG value : "+aDog.getName().equals("Fifi")); // false
	    System.out.println("Adress reference check : "+(aDog == oldDog)); // true
	}

	public static void foo(Dog d) {
	    System.out.println("Foo Method (Max) : "+d.getName().equals("Max")); // true
	    System.out.println("Mem Add in method : "+d.toString());
	    // change d inside of foo() to point to a new Dog instance "Fifi"
	   // d = new Dog("Fifi");
	    System.out.println("Changes Object in Foo (Fifi) : "+d.getName().equals("Fifi")); // true
	    d.setName("Fifi");
	    
	}
	
}

class Dog{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Dog(String name) {
		this.name=name;
	}
}
