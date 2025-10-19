


/*Write a program that reads a number in feet , convert it to meter
 * and display the result 
 * 	1. one foot is 0.305 meter **/


import java.util.Scanner;
public class ConvertFeetIntoMeter { 

	public static void main (String[] args){

		// create a scanner object 
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a value for feet: ");
		double feet = input.nextDouble();

		double meter = feet * 0.305; 

		//Dispaly Result 
		System.out.println(feet + " feet is " + meter + " meters" );

		input.close();

	}
}
