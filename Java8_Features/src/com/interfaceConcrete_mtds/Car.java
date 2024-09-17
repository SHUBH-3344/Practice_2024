package com.interfaceConcrete_mtds;

public class Car implements Vehicle {
	public void start() {
		System.out.println("Car started");
	}

	public static void m1() {
		System.out.println("Car static method");
	}

	public void m2() {
		System.out.println("Car default method");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		 m1();
		c.m2();
		Vehicle.m1(); // static mtd calling by interface name.
		/*
		 * here static method from Vehicle interface is not overriding, but hiding as
		 * new static method with same name is defined in the Car class
		 */
	}
}
