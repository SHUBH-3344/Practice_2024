package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Sachin", "Sehavag" , "Virat");
		Spliterator<String> spliterator = list.spliterator();
		spliterator.forEachRemaining(i -> System.out.println(i));
		
		double price = 120.87;
		System.out.println(price);
		
		double price1 = 120.8755d;
		System.out.println(price1);
		

		float price3 = 120.8755f;
		System.out.println(price3);
		
		long price4 = 120l;
		System.out.println(price4);
	}
}
