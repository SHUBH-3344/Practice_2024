package com.optional.classdemo;

import java.util.Optional;

public class User {
	
	//without optional object
	public String getUsername(int id) {
		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else if (id == 102) {
			return "Sham";
		} else {
			return null;
		}

	}
	//with optional object
	public Optional<String> getUsernameById(Integer id) {
		String name = null;
		if (id == 100) {
			name = "Raju";
		} else if (id == 101) {
			name = "Rani";
		} else if (id == 102) {
			name = "Rani";
		}
		return Optional.ofNullable(name);
	}

}
