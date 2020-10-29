package com.java.collections.ds;

public class MainStackWithLinkedList {
	
	public static void main(String[] args) {
		LinkedStack stack = new LinkedStack();
		stack.push(new Employee("Uday", "Gupta", 27));
		stack.push(new Employee("Ashu", "Gupta", 03));
		stack.push(new Employee("Akilesh", "Gupta", 04));
		stack.push(new Employee("Vivo", "Gupta", 11));
		
		
		stack.printStack();
		System.out.println("Top ---> "+stack.peek());
		
		System.out.println("Popped : "+stack.pop());
		
		System.out.println("Top ---> "+stack.peek());
	}

}
