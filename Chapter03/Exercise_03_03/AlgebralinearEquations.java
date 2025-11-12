


/* Exersie 3.3  Algebra: solve linew equation
 *
 * Write a program that prompt the user to enter 
 * a , b , c , d, e, and f & Display the result that 
 * if ad - bc is  0 , report that the equation has no solution
 * **/

import java.util.Scanner; 

public class AlgebralinearEquations {

	public static void main (String[] args) { 

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float d = input.nextFloat();
		float e = input.nextFloat();
		float f = input.nextFloat();

		// Compute the linear Equation 

		if ((a * d -  b * c) == 0) {

			System.out.print("The Equation has no solution! ");
		} else {

			float x = (e * d - b * f) / (a * d - b * c);
			float y = (a * f - e * c) / (a * d - b * c);
			System.out.println("x is " + x + " and y is " + y);

		}
	}
}





