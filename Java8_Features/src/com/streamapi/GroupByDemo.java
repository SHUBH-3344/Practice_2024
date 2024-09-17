package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByDemo {
	public static void main(String[] args) {
		Employee2 em1 = new Employee2(101, "Shubh", 175000.00, "India");
		Employee2 em2 = new Employee2(102, "Sham", 75000.00, "USA");
		Employee2 em3 = new Employee2(103, "Karan", 85000.00, "UK");
		Employee2 em4 = new Employee2(104, "Pratham", 95000.00, "India");

		
		// grouping by country
		List<Employee2> list = Arrays.asList(em1, em2, em3, em4);
		
		Map<String, List<Employee2>> data = list.stream()
				.collect(Collectors.groupingBy(i -> i.country));
		
		System.out.println(data);
	
		

	}
	
}

class Employee2 {
	int id;
	String name;
	double salary;
	String country;

	public Employee2(int id, String name, double salary, String country) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", salary=" + salary + ", country=" + country + "]";
	}



}


