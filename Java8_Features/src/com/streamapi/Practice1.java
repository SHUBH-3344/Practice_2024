package com.streamapi;

import java.util.Arrays;
import java.util.function.Predicate;

public class Practice1 {
	public static void main(String[] args) {
		String[] names = { "Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };

		Predicate<String> p = name -> name.charAt(0) == 'A';

		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}
		
		// by using for each
		Arrays.stream(names).filter(s -> s.startsWith("A")).forEach(s -> System.out.println(s));
	}

}
