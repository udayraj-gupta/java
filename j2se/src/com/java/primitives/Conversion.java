package com.java.primitives;

public class Conversion 
{ 
	// overloaded method 
	public void method(int i) 
	{ 
		System.out.println("Primitive type int formal argument :" + i); 
	} 
	
	// overloaded method primitive formal argument 
	// and to be invoked for wrapper Object as 

	public void method(float i) 
	{ 
		
		System.out.println("Primitive type float formal argument :" + i); 
	} 
	public static void main (String[] args) 
	{ 
	
		Conversion c = new Conversion(); 
		
		// invoking the method with signature 
		// has widened data type 
		c.method(10); 
		c.method(new Long(100)); 
		byte val = 5; 
		c.method(val);
	}
} 


