package com.java.threads;

//class MyTask{
//	void executeTask() {
//		for(int doc=0;doc<=5;doc++) {
//			System.out.println("Printing Doc : "+doc+" -Printer 1");
//		}
//	}
//}

class MyTask extends Thread{
	@Override
	public void run() {
		System.out.println("Thead State in run() : "+this.getState());
		for(int doc=0;doc<=5;doc++) {
			System.out.println("^^Printing Doc : "+doc+" -Printer 1 with thread : "+Thread.currentThread().getName());
		}
	}
}

public class ThreadClass {
	
	//main methods represents main thread. 
	public static void main(String[] args) {
		//whatever jobs written here will be executed by main thread in sequence manner
		
		System.out.println("-------------- App Started -----------------"+Thread.currentThread().getName());
		
		MyTask m = new MyTask(); /* Child / Worker Thread */
		System.out.println("Thead State : "+m.getState());
//		new Thread(new MyTask()).setDaemon(true);
		m.start(); //Main & MyTask executing parallely /concurrently
		System.out.println("Thead State : "+m.getState());
//		m.run();  //If alled directly then new thread is not created & main thread will run this.
		
		for(int doc=0;doc<=5;doc++) {
			System.out.println("Child Thead State in main() loop: "+m.getState());
			System.out.println("Printing Doc : "+doc+" -Printer 2");
		}
		
		System.out.println("-------------- App Ended -----------------");
		
	}

}
