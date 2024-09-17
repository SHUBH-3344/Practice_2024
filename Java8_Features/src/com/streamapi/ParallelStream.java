package com.streamapi;

import java.util.stream.Stream;

public class ParallelStream {
	public static void main(String[] args) {
		System.out.println("==========Serial stream==========");
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		stream.forEach(i -> System.out.println(i + " :: " + Thread.currentThread()));

		System.out.println("==========Parallel stream==========");
		Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5);
		stream2.parallel().forEach(i -> System.out.println(i + " :: " + Thread.currentThread()));

	}
}
