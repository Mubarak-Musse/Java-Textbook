

/*
 * Exercise 2.1  : Write a program that read a celsius degree 
 * in double value formteh console , then converts it to fahrenheit 
 * and display teh result 
 * **/

import java.util.Scanner; // Scanner is in teh java.util package 
public class convertCelsiusToFahrenheit{

	public static void main (String[] args){
		// Create a Scanner object 
		Scanner input = new Scanner (System.in);

		System.out.println("Enter a degree in Celsius: ");
		double celsius  = input.nextDouble();


		// Conversiotn Formual
		double fahrenheit = (9.0 / 5 ) * celsius  + 32 ;

		System.out.println(celsius  + " Celsius is " + fahrenheit + " Fahrenheit ");

	}
}
