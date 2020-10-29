package com.java.collections.ds;

public class LinkedListMain {
	
	public static void main(String[] args) {
		Employee uday = new Employee("Uday", "Gupta", 27);
		Employee ashu = new Employee("ashu", "Gupta", 03);
		Employee akhilesh = new Employee("akhilesh", "Gupta", 04);
		
		LinkedListOperations list = new LinkedListOperations();
		list.addToFront(uday);
		list.addToFront(ashu);
		list.addToFront(akhilesh);
		list.printList();
		
		System.out.println(list.getSize());
		
		list.reverse();
		list.printList();

	}

}
