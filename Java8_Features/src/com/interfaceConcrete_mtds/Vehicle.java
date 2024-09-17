package com.interfaceConcrete_mtds;

public interface Vehicle {
	public abstract void start();
	
	public static void m1() {
		System.out.println("Interface static method");
	}
	
	public default void m2() {
		System.out.println("Interface default method");
	}


}
