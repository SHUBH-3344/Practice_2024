package com.date.time.api;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTimenew {
	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2023, 10, 28);  // required date
		System.out.println(of);
		
		LocalDate date = LocalDate.now();   // todays date
		System.out.println(date);
		
		LocalDate plusDays = date.plusDays(10);
		System.out.println(plusDays);
		
		LocalDate plusDays1 = date.plusMonths(2);
		System.out.println(plusDays1);
		
		LocalDate plusDays2 = date.plusYears(5);
		System.out.println(plusDays2);
		
		boolean leapYear = LocalDate.parse("2023-12-12").isLeapYear();
		System.out.println("leapYear:: " +leapYear);
		
		boolean before = LocalDate.parse("2023-05-12").isBefore(LocalDate.now());
		System.out.println(before);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalTime plusHours = time.plusHours(2);
		System.out.println(plusHours);
		
		LocalTime minusHours = time.minusHours(1);
		System.out.println(minusHours);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		Period between = Period.between(LocalDate.parse("1995-11-24"), LocalDate.now());
		System.out.println(between);
		
		Duration duration = Duration.between(LocalTime.parse("20:00"), LocalTime.now());
		System.out.println(duration);
	}

}
