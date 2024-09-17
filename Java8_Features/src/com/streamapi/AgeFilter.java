package com.streamapi;

import java.util.stream.Stream;

public class AgeFilter {
	public static void main(String[] args) {
		User u1 = new User("Ram", 20);
		User u2 = new User("Sham", 11);
		User u3 = new User("Shubham", 29);
		User u4 = new User("Govind", 25);
		User u5 = new User("Hari", 15);
		User u6 = new User("Pratham", 18);

		Stream<User> data = Stream.of(u1, u2, u3, u4, u5, u6);
         //age>=18		         
		//data.filter(u -> u.age >=18).forEach(u -> System.out.println(u.name));
        
		//nameStrtswith "S"		
		//data.filter(u ->u.name.startsWith("S")).forEach(u -> System.out.println(u.name));

        //age>=18 and nameStrtswith "S"	
        //data.filter(u -> u.age >=18 && u.name.charAt(0)=='S').forEach(u -> System.out.println(u.name));
		//data.filter(u -> u.age >= 18 && u.name.startsWith("S")).forEach(u -> System.out.println(u.name));

        // filter method calling 2 times
        data.filter(u -> u.age>=18).filter(u -> u.name.startsWith("S")).forEach(u -> System.out.println(u.name));

	}

}

class User {
	String name;
	int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}
