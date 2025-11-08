



/*
 * Financial Application : Compound value 
 *
 * Write a program that prompt teh user to enter a monthly saving amount and
 * dispalys the account value after sixth month */


import java.util.Scanner;

public class financialApplication {

	public static void main (String[] args) { 

		/* Scanner objects*/
		Scanner input = new Scanner(System.in);
		final double MONTHLY_INTEREST_RATE = 0.00417;

		/*Formual to calcualte the interst rate
		 * Future Value  = Present Value (1+r)n */
		
		System.out.println("Enter the monthly  saving amount: ");
		double monthlySaving = input.nextDouble();
		
		// Compute first month account value
		double total = 100 * (1 + MONTHLY_INTEREST_RATE);
		// Compute second month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute third month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute forth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute fifth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);
		// Compute sixth month account value
		total = (100 + total) * (1 + MONTHLY_INTEREST_RATE);

		// Display result
		System.out.printf("After the sixth month, the account value is %5f \n " , total);
	}
}
