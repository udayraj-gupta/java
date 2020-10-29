package com.java.basics;


/*transient methods must be static. transient variable must not be static and all the static variable never serialize
 *  cause Serialization works with Object state*/
class A{
	transient String balance="1000";
	int id;
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "A [balance=" + balance + ", id=" + id + "]";
	}
	
}

public class Keywords {

	
	public static void main(String[] args) {
		A a = new A();
		a.setBalance("500");
		a.setId(20);
		System.out.println(a);
	}
}
