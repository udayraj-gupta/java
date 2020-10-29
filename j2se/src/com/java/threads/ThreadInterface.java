package com.java.threads;

class CA{	
}

/*
 * Multiple Inheritance is not supported by JAVA hence interface can be used to
 * achieve
 */
class Task extends CA implements Runnable{
	@Override
	public void run() {
		for(int doc=0;doc<=5;doc++) {
			System.out.println("^^Printing Doc : "+doc+" -Printer 1");
		}
	}
}

public class ThreadInterface {
	
	//main methods represents main thread. 
	public static void main(String[] args) {
		//whatever jobs written here will be executed by main thread in sequence manner
		
		System.out.println("-------------- App Started -----------------");
		
//		Runnable r = new Task();
		Task t= new Task();
		Thread task = new Thread(t); //can also pass ->  new Thread(r);
		task.setPriority(Thread.MIN_PRIORITY); //O.S may or may not support priority
		task.start(); //Main & MyTask executing parallely /concurrently
		System.out.println("Test Priority");
		for(int doc=0;doc<=5;doc++) {
			System.out.println("Printing Doc : "+doc+" -Printer 2");
		}
		
		System.out.println("-------------- App Ended -----------------");
		
	}

}
