package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
	public static void main(String[] args) {
		List<String> javaCourses = Arrays.asList("CoreJava", "AdvanceJava", "SprinBoot");
		List<String> uICourses = Arrays.asList("HTML", "CSS", "JS");
		List<List<String>> course = Arrays.asList(javaCourses, uICourses);
		// System.out.println(course); // [[CoreJava, AdvanceJava, SprinBoot], [HTML,
		// CSS, JS]
		course.stream().forEach(s -> System.out.println(s));
		/*
		 * [CoreJava, AdvanceJava, SprinBoot] [HTML, CSS, JS]
		 */

		System.out.println("=======================");
		Stream<String> fm = course.stream().flatMap(s -> s.stream());
		fm.forEach(s -> System.out.println(s));

	}

}
