
/**
 * Exersice 2.17 (Science:Wind-chill temperature)
 * Write a program that prompt the user to enter a termperature between -58F
 * & 41F and a wind speed greater than or equal to 2 then display the wind chill 
 * termperature
 * */

import java.util.Scanner; 

public class ScienceWindChillTemperature { 

	public static void main (String[] args ){

		/* Scaner object*/
		Scanner input = new Scanner(System.in);

		/*Prompt user to enter values*/
		System.out.print("Enter the temperature in Fahrenheit Between" 
			+ "-58F and 41F");
		double temperature = input.nextDouble();
		System.out.print("Enter the Wind Speed (>= 2) in miles per hour:");
		double windSpeed = input.nextDouble();

		// Compute the wind chill index 
		double windChill = 35.74 + 0.6215 * temperature -
		35.75 * Math.pow(windSpeed, 0.16) + 
		0.4275 * temperature * Math.pow(windSpeed, 0.16);

		System.out.println("The Wind Chill index is" + ((float) windChill));
	}
}
		




