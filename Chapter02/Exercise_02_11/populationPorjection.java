


/* Exersice 2.11 --> Population Projection 
 * Rewrite programming Exercise 1.11 to prompt
 * use to enter the number of years and display 
 * the population after the number of years
 * Use the hint provided in Exersice 1.11 
 * **/

import java.util.Scanner;

public class populationPorjection { 

	public static void main (String [] args) { 

		/* Scanner Objects*/
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of years: ");
		int years = input.nextInt();

		// Calculate population projection
		int population = 312032486 + (((31536000 / 7) - (31536000 / 13) + (31536000 / 45)) * years);

		/*Display resul*/
		System.out.println("The population in 5 years is: "+ population);
	} 
}


