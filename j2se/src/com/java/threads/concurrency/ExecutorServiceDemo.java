package com.java.threads.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
	
	
	public static void main(String[] args) {
	
	// Create the Pool
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("coreCount : "+coreCount);
//	ExecutorService service = Executors.newFixedThreadPool(coreCount);
		ExecutorService service = Executors.newCachedThreadPool();
	
	// Submit the Task for Execution
	for(int i=0;i<100;i++)
		service.execute(new MyTask());
	System.out.println("Thread Name : "+Thread.currentThread().getName());
		service.shutdown();
	}

}

class MyTask implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread Name : "+Thread.currentThread().getName());
	}
}
