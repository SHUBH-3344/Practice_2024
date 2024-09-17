package com.streamapi;

import java.util.Arrays;
import java.util.List;

import javax.tools.JavaCompiler;

public class StreamApi_SlicingDemo {
	public static void main(String[] args) {
		List<String> javaCourses = 
		Arrays.asList("CoreJava", "AdvanceJava", "SprinBoot", "RestApi", "Microservices");
		//  first 3 records only print
		javaCourses.stream().limit(3).forEach(i-> System.out.println(i));
		
		// skip first 3 and then further print
		System.out.println("==================");
		javaCourses.stream().skip(3).forEach(i-> System.out.println(i));

		System.out.println("==================");
		// disctinct name
		List<String> names = 
				Arrays.asList("Raja", "Rani", "Raja", "Rani", "Raja", "Rohan");
		names.stream().distinct().forEach(i -> System.out.println(i));

	
	}
	
}
