package com.java.lambda;

@FunctionalInterface
interface Cab{
//	public void bookCab(String src, String dest);
	public double bookCab(String src, String dest);
}
/*
 * class b implements Cab{ public void bookCab() {
 * System.out.println("Cab is booked!!"); } }
 */

public class LambdaApp {
	int instanceVar = 10;
	static int sVar=100;
	
	public static void main(String[] args) {
		LambdaApp l = new LambdaApp();
			Cab c = (src,dest)->{
			int local=1;
			System.out.println("Cab is booked from "+src+" to "+dest);
//			System.out.println("instanceVar : "+l.instanceVar);
//			System.out.println("Static var : "+LambdaApp.sVar);
//			System.out.println("Local var : "+local);
			return 850.50;
		};	
		c.bookCab("Mumbai", "Pune");
	}
		  
			
	}

