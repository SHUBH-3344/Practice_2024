package com.streamapi;

import java.util.Arrays;
import java.util.List;

public class MapDemo {
	public static void main(String[] args) {
		// country name in smallcase, convert them into uppearcase
		List<String> list = Arrays.asList("india", "usa", "uk", "france");
		//list.stream().map(name -> name.toUpperCase()).forEach(i -> System.out.println(i));
		list.stream().mapToInt(name ->name.length()).forEach(i -> System.out.println(i));
	
	// given names, print length and name which starts with "A". (here combining filter and map)
		
		List<String> list2 = Arrays.asList("Ashok", "Arav", "Akash", "Anilkumar", "Shubham", "Pratham");
		list2.stream()
		.filter(name -> name.startsWith("A"))
		.map(name -> name + "-" +name.length())
		.forEach(i -> System.out.println(i));
	}

}
