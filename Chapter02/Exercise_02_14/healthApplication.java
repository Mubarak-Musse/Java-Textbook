


/*
 * Eexersice 2.14 ( Health Application: Computing BMI)
 *
 * Write a program that prompt the user to enter a weight in pounds 
 * and height in inches and displays the BMI 
 * 	 1 Pounds = 0.45359 
 * 	 **/

import java.util.Scanner;

public class healthApplication { 

	public static void main (String[] args) { 

		/* Create Scanner objects*/
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter weight in pounds
		System.out.print("Enter weight in pounds:" );
		double weight = input.nextDouble();

		//Prompt the user to enter heght in inches 
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		double BMI = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);

		System.out.printf("BMI is:%5f \n ", BMI);
	}
}



