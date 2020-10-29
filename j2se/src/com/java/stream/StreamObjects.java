package com.java.stream;

import java.lang.reflect.Array;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamObjects {
	
	public static void main(String[] args) {
		//create stream
		Stream stream = Stream.of("a","b","c");
		stream.forEach(System.out::println);
		List<String> list =  Arrays.asList("Uday","Raj","Gupta"); 
		Stream<String> s =list.stream();
		s.forEach(System.out::println);
		LocalDate l =LocalDate.now(ZoneId.of("GMT+05:30"));
		System.out.println(l);
		
		Instant i = Instant.now();
		System.out.println(i);
		LocalDateTime currTime = LocalDateTime.now();
        System.out.println("current date time: "+currTime);
	}

}
