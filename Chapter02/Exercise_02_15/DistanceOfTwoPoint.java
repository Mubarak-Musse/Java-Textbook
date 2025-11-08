
/**
 * Exers 2.15 Geometry distance of two points 
 * Write a program that prompt the user to enter 2 points 
 * 	(X1 , Y1) and (X2, Y2) and display the distance 
 * the formula for computing the distanc is:
 * 	((x1 - x2)** 2 +(y2 -y1)**2) * 0.5 
 *
 * */

import java.util.Scanner;

public class DistanceOfTwoPoint { 

	public static void main (String [] args ) {

		/*Creating Scanner Object*/
		Scanner input = new Scanner(System.in);

		/*Prompt user to enter x  & values**/

		System.out.println("Enter X1 and Y1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print("Enter X2 & Y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();


		//Compute the Distance between 2 points 
		
		double distance = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);

		// Dispaly result 
		
		System.out.print("The Distance between the 2 points is: " + Math.pow(distance, 0.5));
	}
}


		

