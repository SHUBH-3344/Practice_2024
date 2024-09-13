package com.sb1;

public class Car {
	private IEngine eng;

	// Constructor based Injection
	public Car(IEngine eng) {
		this.eng = eng;
	}
	
	//setter injection
	public void setEng (IEngine eng) {
		this.eng = eng;
		
	}

	public void drive() {
		int start = eng.start();

		if (start >= 1) {
			System.out.println("Journey started");
		} else {
			System.out.println("Engine trouble");
		}

	}

}
