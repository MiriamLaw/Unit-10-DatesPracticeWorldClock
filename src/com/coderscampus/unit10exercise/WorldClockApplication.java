package com.coderscampus.unit10exercise;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class WorldClockApplication {

	// In this exercise, we are going to be using ZonedDateTime from the java.time
	// package. Like LocalDate and LocalDateTime,
	// starting from Java 8 onwards, we can easily add in timezones to our date to
	// get the correct time information
	// from different countries. If you chose your own countries, you may need to do
	// a quick google search on your country
	// zone id. The format is usually <Continent>/<City>

	private final static ZoneId BRISBANE = ZoneId.of("Australia/Brisbane");
	private final static ZoneId DUBLIN = ZoneId.of("Europe/Dublin");
	private final static ZoneId BARCELONA = ZoneId.of("Europe/Madrid");

	public static void main(String[] args) {

		// first we need to capture what the time is at this exact moment...
		ZonedDateTime zonedDateTime1 = ZonedDateTime.now(BRISBANE);
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(DUBLIN);
		ZonedDateTime zonedDateTime3 = ZonedDateTime.now(BARCELONA);

		// from here you will need to create three system outs to print out the times
		// and dates

		System.out.println(zonedDateTime1.withZoneSameInstant(BRISBANE));
		System.out.println(zonedDateTime2.withZoneSameInstant(DUBLIN));
		System.out.println(zonedDateTime3.withZoneSameInstant(BARCELONA));

		// ZonedDateTime has a method called withZoneSameInstant(<ZoneId>) which gives
		// you the exact date time in the
		// time zone you put in using the zone id. Try putting in
		// zonedDateTime.withZoneSameInstant(BRISBANE)...

		DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		// after we grabbed the time in our country, we need to format the output using
		// our DateTimeFormatter...
		System.out.println("Brisbane, Australia -> " + zonedDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		
		System.out.println("Dublin, Ireland -> " + zonedDateTime2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		
		System.out.println("Barcelona, Spain -> " + zonedDateTime3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));

		// we need to format it in a way that is easily readable, for this assignment,
		// use FormatStyle.MEDIUM

		// ... .format(DateTImeFormatter.ofLocalizedDateTIme(FormatStyle.MEDIUM));

	}

}
