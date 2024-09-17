package com.streamapi;

// WAJP to find numbers greater than 20
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 30, 24, 56,9,7);
		
		// normal java code
		/*	for (int i : list) {
			if (i>20) {
				System.out.println(i);
			}
		} */
	
		
		// using streamAPI and Lambda complete code
		/* Stream<Integer> stream = list.stream();
		Stream<Integer> filteredStream = stream.filter(i -> i>20);
		filteredStream.forEach(i -> System.out.println(i));  */
		
		// concise code using streamapi
		list.stream().filter(i -> i>20).forEach(i -> System.out.println(i));
		
		
		List<String> names = Arrays.asList("Ashok", "Arnav", "Smith", "Sam", "Anupama");
		names.stream().filter(i -> i.charAt(0) == 'A').forEach(i -> System.out.println(i));
		System.out.println("========================");
		names.stream().filter(i -> i.startsWith("S")).forEach(i -> System.out.println(i));
	}

}
