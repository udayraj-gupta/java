package com.java.collections.ds;


/*Improvement over Queue to prevent memory issue at front after removal of element*/
public class ArrayCircularQueue {
	
	private Employee[] queue;
	private int front;
	private int back;
	
	public ArrayCircularQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	public void add(Employee employee) {
		// Before Resizing check if No of Element is equal to queue size
		if(size()==queue.length-1) { 
			Employee[] newArray = new Employee[2*queue.length];
//			System.arraycopy(queue, 0, newArray, 0, queue.length);
			System.arraycopy(queue, front, newArray, 0, queue.length-front); //Copy front - queue length-front
			System.arraycopy(queue, 0, newArray, queue.length-front, back); //Copy Front element 0-Back adding in previous end position
			queue=newArray;
			back=size(); //After Resize Array back will be set
		}
//		queue[back++]=employee; // Simple queue problem of pointing new greater index position
		queue[back] = employee; //making employee reference null
		System.out.println("Back : "+back+" Length : "+(queue.length-1));
		if(back < queue.length-1) {
			back++;
		}else {
			back=0; //Because Elements removed from queue & resize doesn't happen. SO Circular started here.
		}
	}
	
	public Employee remove() {
		Employee employee=queue[front];
		queue[front] = null;
		front++;	//pointing to new index position after removal from front
		if(size()==0) {
			front=0;
			back=0;
		}else if(front==queue.length) {
			front=0; //Removing the element it will circulate to start position
		}
		return employee;
	}
	
	public int size() {
		if(front<=back) { //Checking negtive condtion here
		return front-back;
		}else {
			return front-back+queue.length;  //Negative to positive here
		}
	}
	public Employee peek() {
		return queue[front];
	}
	
	public void printQueue() {
		if(front<back) {
		for(int i=front;i<back;i++) {
			System.out.println(queue[i]);
		}
		}else {
			for(int i=front;i<queue.length;i++) {
				System.out.println(queue[i]);
			}
			for(int i=0;i<back;i++) {
				System.out.println(queue[i]);
			}
		}
	}

}
