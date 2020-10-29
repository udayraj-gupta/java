package com.java.collection.list;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> hashMap = Collections.synchronizedMap(new HashMap<String, String>());
		hashMap.put("27", "Uday");
		hashMap.put("03", "Ashu");
		hashMap.put(null, null);
		hashMap.put("04", "Akhilesh");
		hashMap.putIfAbsent("03", "Ashutosh"); //If key is not occupied then only this will add.
		hashMap.put("11", "Vivo");
		
		hashMap.forEach((K,V)->System.out.println("Key : "+K+" Value : "+V));
		
		System.out.println(hashMap.getOrDefault("16", "something")); //Get default will return val rather than null.
		
	}

}
