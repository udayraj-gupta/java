package com.java.oops;

/*With default keyword new features can be implemented in existing interface without 
 * each & every implementing class needs to again implement by spending developers time & cost.*/

interface RBI{
	void withdrawn();
	void deposit();
	
	public default void adharLink() {
		System.out.println("Cust should Link their Aadhar with Bank");
	}
	public default void minBal() {
		System.out.println("Cust should keep minimum 1000 Banlace in Bank Account");
	}
	
}

class Axis implements RBI{

	@Override
	public void withdrawn() {
		System.out.println("AXIS withdrawn");
	}

	@Override
	public void deposit() {
		System.out.println("AXIS deposit");
	}
	@Override
	public void adharLink() {
		System.out.println("your Aadhar had been linked");
	}
	@Override
	public void minBal() {
		System.out.println("Minimum Balance 10,000 required");
	}
}

class SBI implements RBI{
	@Override
	public void withdrawn() {
		System.out.println("SBI withdrawn");
	}

	@Override
	public void deposit() {
		System.out.println("SBI deposit");
	}
}

public class Java8InterfaceBank {
	
	public static void main(String[] args) {
		Axis axisUser = new Axis();
		SBI sbiUser = new SBI();
		
		axisUser.withdrawn();
		axisUser.minBal();
		
		sbiUser.withdrawn();
		sbiUser.minBal();
	}

}
