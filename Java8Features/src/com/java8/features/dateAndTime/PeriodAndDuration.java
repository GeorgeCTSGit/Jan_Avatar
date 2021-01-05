package com.java8.features.dateAndTime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class PeriodAndDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PeriodAndDuration().testPeriod();
		new PeriodAndDuration().testDuration();
	}
	
	public void testPeriod() {
	      //Get the current date
	      LocalDate date1 = LocalDate.now();
	      System.out.println("Current date: " + date1);
			
	      //add 1 month to the current date
	      LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
	      System.out.println("Next month: " + date2);
	      
	      //d1 to d2 give 1 as answer. d2 to d1 give -1 as answer
	      Period period = Period.between(date2, date1);
	      System.out.println("Period: " + period);
	   }
	
	public void testDuration() {
	      LocalTime time1 = LocalTime.now();
	      Duration twoHours = Duration.ofHours(2);
			
	      LocalTime time2 = time1.plus(twoHours);
	      Duration duration = Duration.between(time1, time2);
			
	      System.out.println("Duration: " + duration);
	      
	      
	      LocalDate date1 = LocalDate.now();
	    //get the second saturday of next month
	     // LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);
	      
	      LocalDate firstInYear = LocalDate.of(date1.getYear(),Month.SEPTEMBER, 1);
	      
	      System.out.println(firstInYear);
	      /*LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
	         DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
	      System.out.println("Second Saturday on : " + secondSaturday);*/
	      
	      //LocalDate currDate = LocalDate.now();
	      //System.out.println("currDate "+ currDate);
	      
	      //next Tuesday
	      /*LocalDate nextTue = currDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
	      System.out.println(nextTue);*/
	      
	     /* System.out.println(firstInYear.with(TemporalAdjusters.nextOrSame(
	 	         DayOfWeek.SATURDAY)));
	     */ System.out.println(firstInYear.plus(1, ChronoUnit.MONTHS));
	      System.out.println(firstInYear.plus(1, ChronoUnit.MONTHS).
	    		  with(TemporalAdjusters.next(DayOfWeek.SATURDAY)).
	    		  with(TemporalAdjusters.next(DayOfWeek.SATURDAY)));
	   }

}
