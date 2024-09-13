package com.sb1;

public class DiselEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("Disel engine started");
		return 1;
	}

}
