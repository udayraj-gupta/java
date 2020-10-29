package com.java.collection.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(10);
		int pop = stack.pop();
		System.out.println(pop);
		System.out.println(stack.peek());
		stack.push(100);
		System.out.println(stack.size()+" : "+stack.capacity());
		System.out.println(stack.peek());
	}

}
