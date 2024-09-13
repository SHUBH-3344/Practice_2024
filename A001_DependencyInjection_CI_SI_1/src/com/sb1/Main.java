package com.sb1;

public class Main {
	public static void main(String[] args) {
		
		Car car = new Car(new PetrolEngine()); // parameterized constructor
		
		car.setEng(new DiselEngine());   // calling setEng method i.e setter based injection
		
		car.drive();      
	}

}

//here we have applied both CI and SI but SI will override on CI