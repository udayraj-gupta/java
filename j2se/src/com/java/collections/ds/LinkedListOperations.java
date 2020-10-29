package com.java.collections.ds;

public class LinkedListOperations {
	private EmployeeNode head;
	int size;
	
	public int getSize() {
		return size;
	}
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head=node;
		size++;
	}
	
	public void printList() {
		EmployeeNode current=head;
		System.out.println("->");
		while(current!=null) {
			System.out.print(current);
			System.out.print("->");
			current=current.getNext();
		}
		System.out.println("Null");
	}
	
	public void reverse() {
		EmployeeNode pointer=head;
		EmployeeNode previous=null, current=null;
		
		while(pointer!=null) {
			current=pointer;
			pointer=pointer.getNext();
			//Reverse
			current.next=previous;
			previous=current;
			head=current;
			
		}
	}

}
