package com.streamapi;

import java.util.stream.Stream;

// get emp name and emp age whose salary>=50000;

public class MapDemo3 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Shubh", 28, 100000);
		Employee e2 = new Employee("Sham", 38, 90000);
		Employee e3 = new Employee("Ram", 25, 150000);
		Employee e4 = new Employee("Veenu", 28, 44000);
		Employee e5 = new Employee("Krishna", 38, 187000);
		
		Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5);
		// by using filter and map
	//	stream.filter(e -> e.salary>=50000)
	//	.map(e -> "Name: " +e.name + " Age: " + e.age).forEach(e -> System.out.println(e));

		// by using filter only
		stream.filter(e -> e.salary >= 50000).forEach(e -> System.out.println(e.name +e.age));
	}

}

class Employee {
	String name;
	int age;
	int salary;

	Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

}
