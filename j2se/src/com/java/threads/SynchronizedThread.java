package com.java.threads;


class  MyTaskSync extends Thread{
	@Override
	public void run() {
		
		MyTaskSync.print();
	}
	
	public static synchronized void print() {
		for(int doc=0;doc<=5;doc++) {
			System.out.println("Printing Doc : "+doc+" by "+Thread.currentThread().getName());
		}
	}
}
public class SynchronizedThread {
	
	public static void main(String[] args) {
		Thread t1= new Thread(new MyTaskSync(),"T1");
		Thread t2= new Thread(new MyTaskSync(),"T2");
		t1.start();
		t2.start();
	}

}
