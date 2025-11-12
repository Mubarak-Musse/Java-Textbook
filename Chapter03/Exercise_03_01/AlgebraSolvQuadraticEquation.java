/*
 *
 * Algebra: solve quadratic equations)  Write a program that prompts the user to 
 * enter values for a, b, and c and displays the result based on the discriminant
 * if The discriminant is positive(+)
 * 	Display 2 roots 
 * if the discriminnat is 0 
 * 	Display one root
 * else 
 * 	Display the Equation has no real root 
 *
 * */

import java.util.Scanner;

public class AlgebraSolvQuadraticEquation { 

	public static void main(String[] args) {
		
		/*Scanner object*/
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a, b, c:" );
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		//Compute discriminant 

		double Discriminant = Math.pow(((b * b) - 4 * a * c ), 0.5 );

		double Root1 = (-b + Discriminant) / (2 * a);
		double Root2 = (-b - Discriminant) / (2 * a);
		
		if (Discriminant > 0) {
			System.out.print("The Equation has 2 roots " + Root1 + " and " + Root2);
		} 
		else if  (Discriminant == 0 ) { 
			System.out.print("The Equation has one Root " + Root1 );
		}
		else {

			System.out.print("No Real Root: ");

		}
		

	}
}
