package com.java.collections.ds;

import java.util.LinkedList;

public class LinkedStack {
	private LinkedList<Employee> stack;
	public LinkedStack() {
		stack=new LinkedList<Employee>();
	}
	
	public void push(Employee e) {
		stack.push(e);
	}
	
	public Employee pop() {
		return stack.pop();
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public void printStack() {
		stack.forEach((s)->System.out.println(s));
	}

}
