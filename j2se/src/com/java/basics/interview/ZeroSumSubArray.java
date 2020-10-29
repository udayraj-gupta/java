package com.java.basics.interview;

import java.util.HashSet;
import java.util.Set;


/*Given an Array find if sub array sum is equals to 0.
 * n<10^5*/
public class ZeroSumSubArray {

	public static void main(String[] args) {
		int a[] = {2,1,3,-4,-2};
		int k=6;
		boolean found=false;
//		for(int i=0;i<a.length;i++) {
//			int sum=0;
//			for(int j=i;j<a.length;j++) {
//				sum+=a[j];
//			}
//			if(sum==0) {
//				found=true;
//				System.out.println("Zero Sum Sub Array");
//				break;
//			}
//			if(found)break;
//		}
		
		Set<Integer> set = new HashSet<Integer>();
		int sum=0;
		for (int element : a) {
			set.add(sum);
			sum+=element;
//			if(set.contains(sum)) {
			if(set.contains(sum-k)) {
				found=true;
				System.out.println(found);
				break;
			}
		}
	}

}
