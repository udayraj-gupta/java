package com.java.threads;

class Q{
	int num;
	boolean valueSet = false;
	
	
	public Q() {
	}
	public Q(int num) {
		this.num = num;
	}
	
	public synchronized void put(int num){
		while(valueSet) {
			try {wait();}catch (Exception e) {e.printStackTrace();}
		}
		System.out.println("Put : "+num);
		this.num=num;
		valueSet = true; // after setting value make it true and consumer to consume updated data
		notify(); //Notify Consumer Thread
	}
	public synchronized void get() {
		//check for false condition if value not set then wait
		while(!valueSet) {
			try {wait();}catch (Exception e) {e.printStackTrace();}
		}
		System.out.println("Get : "+num);
		valueSet=false; //reset to change the value by producer
		notify(); //Notify Producer Thread
	}
	
}

class Producer implements Runnable{
	Q q;
	
	public Producer(Q q) {
		this.q =q;
		Thread t = new Thread(this,"Producer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			q.put(i++);
			try {Thread.sleep(500);}catch(Exception e) {e.printStackTrace();}
		}
		
	}
}

class Consumer implements Runnable{
	Q q;
	
	public Consumer(Q q) {
		this.q=q;
		Thread t = new Thread(this,"Cosumer");
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			q.get();
			try {Thread.sleep(2000);}catch(Exception e) {e.printStackTrace();}
		}
		
	}
}

public class InterThreadWaitNotify {

	public static void main(String[] args) {
		Q q = new Q();
		
		new Producer(q);
		new Consumer(q);
		
	}
}
