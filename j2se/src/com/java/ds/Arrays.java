package com.java.ds;

public class Arrays {
	
	public static void main(String[] args) {
		
		//Stores on continous memory
		int[] intArray = new int[7];
		
		intArray[0]=20;
		intArray[1]=30;
		intArray[2]=40;
		intArray[3]=50;
		intArray[4]=60;
		intArray[5]=-20;
		intArray[6]=80;
		
		int indexNo=-1;
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
			if(intArray[i]==50) {
				indexNo=i;
				break;
			}
			
		}
		System.out.println("Index No : "+indexNo);
	}

}
