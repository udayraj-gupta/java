package com.java.interfaces;

public interface Animal {
	public void specialCapabilities();
	default public void leg() {
		System.out.println("animal has 4 legs");
	}
		

}
