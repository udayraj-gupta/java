package com.java.collections.ds;

import java.util.EmptyStackException;

public class ArrayStack {

	private Employee[] stack;
	private int top; //Always points next available position/index in stack
	
	public ArrayStack(int capacity) {
		stack = new Employee[capacity];
	}
	
	public void push(Employee employee) {
		if(top == stack.length) { // Before pushing check the length
			/* Need to resize the Array */
			Employee[] newArray = new Employee[2 * stack.length];
			System.arraycopy(stack,0, newArray, 0, stack.length);
			stack= newArray;
		}
		stack[top++]=employee;
		/*
		 * stack[0]=employee; & then increment to get the stack size in incremented order
		 * cause we are storing in array
		 */
	}
	
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		/*
		 * Reference is referring to lower array & removing the reference so that becomes
		 * null & pre increment here
		 */
		Employee employee= stack[--top]; //pre Decrement to get the index in array 
		stack[top]=null;// Here we don't resize cause if resize then it will be linear time complexity for Element shifting
		return employee;
		
	}
	
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public void printStack() {
		for(int i=top-1;i>=0;i--) {
			System.out.println(stack[i]); //Print in LIFO
		}
	}
}
