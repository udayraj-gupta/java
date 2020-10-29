package com.java.collections.ds;

public class StackMain {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5);
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
