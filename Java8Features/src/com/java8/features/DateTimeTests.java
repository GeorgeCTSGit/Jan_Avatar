package com.java8.features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTimeTests {
	
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println("Current Date = " + ld);
		
		LocalDate todayNewYork = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println("Current Date in America = " + todayNewYork);
		 
		// Current Time
		LocalTime time = LocalTime.now();
		System.out.println("Current Time = " + time);
	}

}
