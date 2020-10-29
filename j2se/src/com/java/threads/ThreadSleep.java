package com.java.threads;

import java.util.concurrent.TimeUnit;

class SleepRunnable implements Runnable{

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		System.out.println("Thread Started : "+Thread.currentThread().getName());
		try {
//			Thread.sleep(2000);
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sleep Time : "+(System.currentTimeMillis()-start));
	}
	}
	

public class ThreadSleep {
	public static void main(String[] args) {
		Thread t = new Thread(new SleepRunnable(),"Sleep Task Thread");
		t.start();
		
	}

}
