package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MatchingOperationDemo {
	public static void main(String[] args) {
		EmployeeDemo ed1 = new EmployeeDemo("Smith", "USA");
		EmployeeDemo ed2 = new EmployeeDemo("Chiu", "China");
		EmployeeDemo ed3 = new EmployeeDemo("Shubh", "India");
		EmployeeDemo ed4 = new EmployeeDemo("John", "UK");
		EmployeeDemo ed5 = new EmployeeDemo("Pratham", "India");
		
		List<EmployeeDemo> asList = Arrays.asList(ed1, ed2, ed3, ed4, ed5);
		
		// check as per condition and give true false
		boolean anyMatch = asList.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println("Any Indian availble ? :: "+anyMatch);
		
		boolean noneMatch = asList.stream().noneMatch(p -> p.name.equals("Shubh"));
		System.out.println("None Shubh name availble ? :: "+noneMatch);
		
		boolean allMatch = asList.stream().allMatch(p -> p.country.equals("USA"));
		System.out.println("All are from USA ? :: "+allMatch);

		// now check and get data
		
		/*
		 * Optional<EmployeeDemo> findAny = asList.stream() .filter(i ->
		 * i.country.equals("India")).findAny(); if (findAny.isPresent()) {
		 * System.out.println(findAny.get());
		 * 
		 * }
		 */
		
		// collect names and country of person who are belongs to India and store into name collection
		
		List<EmployeeDemo> name = asList.stream().filter(p -> p.country.equals("India")).collect(Collectors.toList());
		name.forEach(i-> System.out.println(i));
		
		// collect names of person who are belongs to India and store into namesOnly collection
		System.out.println("====================");
		List<String> namesOnly = asList.stream().filter(i -> i.country.equals("India"))
		.map(i ->i.name).collect(Collectors.toList());
		System.out.println(namesOnly);
	}

}

class EmployeeDemo{
	String name;
	String country;
	public EmployeeDemo(String name, String country) {
		this.name = name;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", country=" + country + "]";
	}
	
}
