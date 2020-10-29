package com.java.interfaces;

public interface TerrestrialAnimal {
	default public void livesIn() {
		System.out.println("Lives in Land");
	}
}
