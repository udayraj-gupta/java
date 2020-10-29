package com.java.interfaces;


/*Diamond problem Solution*/
public class Frog implements Animal, AquaticAnimal,TerrestrialAnimal{

	@Override
	public void livesIn() {
		AquaticAnimal.super.livesIn();
	}

	@Override
	public void specialCapabilities() {
		System.out.println("");
		
	}

	
	
}
