package com.java8.features.dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChromoUnitsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ChromoUnitsCheck().testChromoUnits();

	}
	
	public void testChromoUnits() {
	      //Get the current date
	      LocalDate today = LocalDate.now();
	      System.out.println("Current date: " + today);
			
	      //add 1 week to the current date
	      LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
	      System.out.println("Next week: " + nextWeek);
			
	      //add 1 month to the current date
	      LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + nextMonth);
			
	      //add 1 year to the current date
	      LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
	      System.out.println("Next year: " + nextYear);
			
	      //add 10 years to the current date
	      LocalDate nextDecade = today.plus(1, ChronoUnit.DECADES);
	      System.out.println("Date after ten year: " + nextDecade);
	      
	    //add 2 centuries to the current date
	      LocalDate nextCentury = today.plus(2, ChronoUnit.CENTURIES);
	      System.out.println("2 Century: " + nextCentury);
	      
	      //time
	      LocalTime time = LocalTime.now();
	      System.out.println(time);
	      
	           
	      //time after 20 hrs
	      LocalTime tmrHr = time.plus(20, ChronoUnit.HOURS);
	      System.out.println(tmrHr);
	      
	      
	      
	   }

}
