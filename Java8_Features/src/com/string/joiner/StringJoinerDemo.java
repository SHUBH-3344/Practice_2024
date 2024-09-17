package com.string.joiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		StringJoiner s1 = new StringJoiner("$$");
		s1.add("Shubham");
		s1.add("SDE");
		s1.add("Microsoft");
		System.out.println(s1);
	
		StringJoiner s2 = new StringJoiner("-", "(", ")"); // delimiter ,prefix, suffix
		s2.add("Shubham");
		s2.add("SDE");
		s2.add("Microsoft");
		System.out.println(s2);
	}

}
