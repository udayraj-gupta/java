package com.java.threads;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" - Number : "+i);
			
		}
	}
	
}

public class ThreadRaceCondition {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
		Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
		thread1.start();
		thread2.start();
		
	}
	
}
