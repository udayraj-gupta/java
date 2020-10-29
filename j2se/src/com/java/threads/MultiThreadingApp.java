package com.java.threads;

class Printer{
	void printDocuments(int docCopy, String docName) {
		for(int i=0;i<=docCopy;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 System.out.println("Printing Document : "+docName+" -> "+i);
		}
	}
	
}

class MyThread extends Thread{
	Printer pRef;
	 public MyThread(Printer p) {
		pRef=p;
	}
	 @Override
	public void run() {
		 synchronized (pRef) {
			 pRef.printDocuments(10, "MyCopy.pdf");
		}
		 
	}
}

class YourThread extends Thread{
	Printer pRef;
	 public YourThread(Printer p) {
		pRef=p;
	}
	 @Override
	public void run() {
		 pRef.printDocuments(10, "YourCopy.pdf");
	}
}
public class MultiThreadingApp {
	
	public static void main(String[] args) {
		System.out.println("----------------APP started----------------");
		
		Printer printer = new Printer();
		MyThread myThread = new MyThread(printer);
		YourThread yourThread = new YourThread(printer);
		myThread.start();
//		try {
//			myThread.join(); //Not required if syncronization block is used
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		yourThread.start();
		System.out.println("----------------APP Ended----------------");
	}

}
