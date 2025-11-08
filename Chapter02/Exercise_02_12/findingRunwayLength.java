


/* Pysics: finding runway length
 * Given an airplane's acceleration a  and take-off speed v,
 * you can compute the minimum runway length needed for an airplane to take off 
 * useing the following formula 
 * 	length = v**2 / 2a 
 *
 * Write a program to propmpt the user to enter v in meters/s
 * and accelertation a in m/s 
 * **/

import java.util.Scanner;

public class findingRunwayLength { 

	public static void main (String [] args) {

		/*Creating Scanner object*/
		Scanner input = new Scanner(System.in);

		System.out.print("Enter speed : " );
		double speed = input.nextDouble();
		System.out.print("Enter acceleration:");
		double acceleration = input.nextDouble();

		/*Compute  the minimum runway length*/ 

		double length = Math.pow (speed, 2) / (2 * acceleration ) ; 

		// Display result 
		System.out.printf(" The minimum runway length for this airplane is: % .5f \n meter",  length);
	}
}


