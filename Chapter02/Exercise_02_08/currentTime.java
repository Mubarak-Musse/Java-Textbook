
/*Current time 
 * Write a program the showCurrentTime */

import java.util.Scanner;

public class currentTime { 
	public static void main (String[] args ){
		
		// Prompt the user to enter the time zone 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Time zone offset to GMT: ");
		long timeZoneOffset = input.nextInt();

	//Obtain the total milliseconds since the midnight, Jan 1, 1970
		long totalMilliSeconds = System.currentTimeMillis();

	// Obtain the total seconds since the midnight, Jan 1, 1970
		long totalSeconds = totalMilliSeconds / 1000 ;

	// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

	// obtain the tatl minutes
		long totalMinutes = totalSeconds / 60;
		
	
	// Compute the current minute in the hour 
		long currentMinute = totalMinutes % 60;

	// Obtain the total hours
		long totalHours = totalMinutes / 60;

	// Compute the current hour
		long currentHour = (totalHours + timeZoneOffset) % 24;

	// Display results 
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
  }
}

	
