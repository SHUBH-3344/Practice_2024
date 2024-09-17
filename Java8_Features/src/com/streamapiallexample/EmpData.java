package com.streamapiallexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpData {
	public static void main(String[] args) {
		
		
	List<Employee> employeeList = new ArrayList<Employee>();
    
	employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
	employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
	employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
	employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
	employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
	employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
	employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
	employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
	employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
	employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
	employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
	employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
	employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
	employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
	employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
	employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
	
	// 1. How many male and female employees are there in the organization ?
	
	Map<String, Long> map1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	System.out.println(map1);
	
	//	2. Print the name of all departments in the organization ?  (distinct name printing, duplicated avoided)
	
	employeeList.stream().map(e -> e.department).distinct().forEach(e -> System.out.println(e));
	
 // 3. What is the average age of male and female employees ?
 Map<String, Double> map = employeeList.stream().collect(Collectors.groupingBy(e -> e.gender, Collectors.averagingInt(e -> e.age)));
	System.out.println(map);
	
	
//	4. Get the details of highest paid employee in the organization ?
	Optional<Employee> optional = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing( e -> e.salary)));
	if (optional.isPresent()) {
		Employee employee = optional.get();
		System.out.println(employee);
	}
	
	// 5. Get the names of all employees who have joined after 2015 ?
	employeeList.stream().filter(e -> e.yearOfJoining > 2015).map(e -> e.name).forEach(e -> System.out.println(e));
	
	System.out.println();
	System.out.println("======================");
	System.out.println();
	
	// 6. Count the number of employees in each department ?
	
	Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(e -> e.department, Collectors.counting()));
	System.out.println(collect);
	
	// 7. What is the average salary of each department ?
	
	Map<String, Double> collect2 = employeeList.stream().collect(Collectors.groupingBy( e -> e.department, Collectors.averagingDouble(e -> e.salary)));
			System.out.println(collect2);
			

// 8. Get the details of youngest male employee in the Development department ?
	
			Optional<Employee> optional1 = employeeList.stream().filter(e -> e.gender.equals("Male") && e.getDepartment().equals("Development")).min(Comparator.comparing(Employee::getAge));
	
			if (optional1.isPresent()) {
				System.out.println(optional1.get());
			}
	
			Optional<Employee> optional2 = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
			if (optional2.isPresent()) {
				System.out.println(optional2.get());
			}
	
	
			// 10. How many male and female employees are there in the Sales team ?
			Map<String, Long> collect3 = employeeList.stream().filter(e -> e.department.equals("Sales")).collect(Collectors.groupingBy( e -> e.getGender(), Collectors.counting()));
			System.out.println(collect3);
	
			
			// What is the average salary of male and female employees ?
			System.out.println("=============");
			Map<String, Double> collect4 = employeeList.stream().collect(Collectors.groupingBy(p -> p.gender, Collectors.averagingDouble( p -> p.salary)));
			System.out.println(collect4);
			
			// List down the names of all employees in each department ?
			Map<String, List<String>> collect5 = employeeList.stream().collect(Collectors.groupingBy(e ->e.department, Collectors.mapping(e -> e.name, Collectors.toList())));
			System.out.println(collect5);
		
			// Who is the oldest employee in the organization?
			
			Optional<Employee> collect6 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i.getAge())));
			if (collect6.isPresent()) {
				System.out.println(collect6.get());
			}
			
			// Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ?
			System.out.println("=============");
		employeeList.stream().filter( e -> e.age>=25).forEach( i -> System.out.println(i.getName() + i.age));
		
		
		// What is the average salary and total salary of the whole organization ?
		Double collect7 = employeeList.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println(collect7);
		
		OptionalDouble map3 = employeeList.stream().mapToDouble( i -> i.salary).average();
		 System.out.println(map3);
		
		 double map2 = employeeList.stream().mapToDouble( i -> i.salary).sum();
		 System.out.println(map2);
	
		 // highest salary
	Optional<Employee> collect8 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i.salary)));
	if (collect8.isPresent()) {
		System.out.println(collect8.get());
	
	}
	
	// 2nd highest salary
	// sort employees in descending salary order and skip first record
	Optional<Employee> findFirst = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
	if (findFirst.isPresent()) {
		System.out.println(findFirst.get());
	
	}
	
	// 2nd way by using collect (Collectors.list())
	
	List<Employee> collect9 = employeeList.stream()
	.sorted(Comparator.comparing(Employee::getSalary)
	.reversed()).collect(Collectors.toList());
	System.out.println(collect9.get(2));
	
	
}
}
class Employee{
	int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
     
}

