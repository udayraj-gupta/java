package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorService {
	
	public static void main(String[] args) {
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		for(int i=0;i<100;i++) {
			service.execute(new CPUIntensiveTask());
		}
	}

	static class CPUIntensiveTask implements Runnable{

		@Override
		public void run() {
			System.out.println();
		}
		
	}
}


