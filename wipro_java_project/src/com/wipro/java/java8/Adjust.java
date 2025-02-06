package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;
public class Adjust 
{
	public static void main(String[] args) {
	        // Get the current date
	        LocalDate date = LocalDate.now();
	        System.out.println("The current date is: " + date);

	        // Get the first day of the next month
	        LocalDate firstDayOfNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
	        System.out.println("First day of next month: " + firstDayOfNextMonth);

	        // Get the next Saturday
	        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
	        System.out.println("Next Saturday: " + nextSaturday);
	    
	}


}
