package com.java.basics.interview;

public class StringAnagram {

	public static void main(String[] args) {
		
		String a ="uday";
		String b="duay";
		int al[] = new int[256];
		int bl[] = new int[256];
		boolean ngram=true;
		for (char c : a.toCharArray()) {
			int index = (int)c;
			al[index]++;
		}
		
		
		/*
		 * Better way to find result in n(logn) time complexity as my array size is
		 * constant i.e 256 irrespective of string length. Or we can sort both the string & compare but sorting will 
		 * consume time for shifting within array
		 */
		for (char c : b.toCharArray()) {
			int index=(int)c;
//			bl[index]++;
			al[index]--;
		}
		
		for(int i=0;i<256;i++) {
			if(al[i]!=bl[i]) {
				ngram=false;
			}			
		}
		
		System.out.println(ngram);
	}

}
