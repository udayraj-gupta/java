package com.java.threads;

class YieldRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Started : "+Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			System.out.println("Performing Task : "+i+" By "+Thread.currentThread().getName());
			if(i==5)
				Thread.yield();
		}
	}
	
}

public class ThreadYield {
	public static void main(String[] args) {
		YieldRunnable runnable= new YieldRunnable();
		Thread t1= new Thread(runnable,"T1");
		t1.start();
		Thread t2= new Thread(runnable,"T2");
		t2.start();
		
		
	}
}
