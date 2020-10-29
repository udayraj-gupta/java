package com.java.lambda;

import java.util.stream.Stream;

public class MethodReference {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Uday","raj","Gupta");
		stream.forEach(System.out::println);
		stream.forEach(s->System.out.println(s));
	}

}
