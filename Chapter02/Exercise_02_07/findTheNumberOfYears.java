/*
 * find teh number of years 
 * Write a program that prompts the user to enter
 * the minuts after that display the maximum number
 * of years and remaining days of the minutes 
 *
 * - Assume year has 365 days **/


import java.util.Scanner;

public class findTheNumberOfYears {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

// Prompt the user to enter the number of minutes 

		System.out.print("Enter The Number of Minutes: ");
		int minutes = input.nextInt();

	// Compute the number of years and days 

		int year = minutes / 525600;
		int days = (minutes % 525600) / 1440;

		// Display result 
		System.out.println(minutes + " minutes is approximately " + year + " Year and " + days + " days" );

	}
}


