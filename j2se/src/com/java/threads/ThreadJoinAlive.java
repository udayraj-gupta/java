package com.java.threads;

public class ThreadJoinAlive {
	
	public static void main(String[] args) throws Exception{
		Thread t1 = new  Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Hi : "+Thread.currentThread().getPriority());
//				try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			}
		});
		
		Thread t2 = new  Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Bye : "+Thread.currentThread().getPriority());
//				try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}); 
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
//		try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
		t2.start();
		t1.join();
		t2.join();
		System.out.println("T1 : "+t1.isAlive()+"\tT2 : "+t2.isAlive());
		System.out.println("Main task bye");
		
		}
	}

