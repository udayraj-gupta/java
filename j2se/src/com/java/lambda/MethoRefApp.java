package com.java.lambda;

//Functional Interface
interface Calculator{
	void sum(int num1, int num2);
}

class Calc{
	public static void addSomething(int num1,int num2) {
		System.out.println("Addition is : "+(num1+num2));
	}
	public void letsAdd(long num1,long num2) {
		System.out.println("Non static Addition is : "+(num1+num2));
	}
	
}

interface Messanger{
	Message getMessage(String msg);
}

class Message{
	Message(String s){
		System.out.println("Message constructor : "+s);
	}
}

public class MethoRefApp {

	public static void main(String[] args) {
		//1. Reference to static Method
		Calculator cRef = Calc::addSomething;
		cRef.sum(10, 20);
		
		//2. Reference to Object
		Calc c = new Calc();
		Calculator cObj= c::letsAdd;
		cObj.sum(12, 23);
		
		//3. Reference to Constructor
		Messanger msg = Message::new;
		msg.getMessage("Search the candle");
	}
	
	
}
