package com.optional.classdemo;

import java.util.Optional;
import java.util.Scanner;

public class MessageService {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter userid");
		int userid = sc.nextInt();
		User u = new User();

		/*
		 * String username = u.getUsername(userid); if (username !=null) { // by null
		 * check we can avoid null pointer exception String msg =
		 * username.toUpperCase(); System.out.println(msg + " Hello.."); } else {
		 * System.out.println("Invalid Input.."); }
		 */

		Optional<String> username = u.getUsernameById(userid);
		if (username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase() + "  Hello");
		} else {
			System.out.println("No data found");
		}
	}
}
