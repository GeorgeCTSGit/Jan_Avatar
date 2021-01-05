package com.java8.features.dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDtTm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ZonedDtTm().checkZone();

	}
	
	void checkZone() {
		System.out.println("checkZone");
		// Get the current date and time
	      ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
	      System.out.println("date1: " + date1);
			
	      ZoneId id = ZoneId.of("Europe/Paris");
	      System.out.println("ZoneId: " + id);
			
	      ZoneId currentZone = ZoneId.systemDefault();
	      System.out.println("CurrentZone: " + currentZone);
	      
	      LocalTime t = LocalTime.now(ZoneId.of("US/Eastern"));
	      System.out.println(t);

		
	}

}
