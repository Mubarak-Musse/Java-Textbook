
/*
 * Convert pounds into kilogram 
 * Write a program that Convert Pounds --> Kilograms 
 * The program Prompt the user to enter a number in pounds 
 * Convert to kilometer 
 * Display the result **/


import java.util.Scanner;
public class ConvertPoundsintokilogram { 

	public static void main (String[] args ){

		// Create Scanner Object 
		Scanner input = new Scanner(System.in);

		// Prompt user to enter value 
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();

		double kilogram = pounds * 0.454 ;

		// Display result 
		
		System.out.println (pounds + " Pounds is " + kilogram+ " Kilogram");


	}


}
