package com.java.interfaces;

public interface AquaticAnimal {
	default public void livesIn() {
		System.out.println("Lives in water");
	}

}
