package com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Write a java program to get Max, Min and Avg salary from given employess data using Stream API. 
public class Max_Min_AvgSalary {
	public static void main(String[] args) {
		Employee1 em1 = new Employee1(101, "Shubh", 175000.00);
		Employee1 em2 = new Employee1(102, "Sham", 75000.00);
		Employee1 em3 = new Employee1(103, "Karan", 85000.00);
		Employee1 em4 = new Employee1(104, "Pratham", 95000.00);

		List<Employee1> list = Arrays.asList(em1, em2, em3, em4);
		
		// max salary
		Optional<Employee1> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(i ->i.salary)));
	    System.out.println(max.get().salary);
	    
	    // min salary
	    Optional<Employee1> min = list.stream().collect(Collectors.minBy(Comparator.comparing(i -> i.salary)));
	    System.out.println(min.get().salary);
	    //avg salary
	    Double avg = list.stream().collect(Collectors.averagingDouble(i -> i.salary));
	System.out.println(avg);
	}
	
}

class Employee1 {
	int id;
	String name;
	double salary;

	public Employee1(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
