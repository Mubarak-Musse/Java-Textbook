


/*Algebra: Solve 2 * 2 linear equaion 
 *
 * You can use cramer's rule to solve the following 
 * 2 * 2 system of linear equation provided that ad-bs is not 0:
 *
 * Write a program that solves the following equation and displays the  value for 
 * x and y  **/

public class AlgebraSolveLinearEquation {

	public static void main (String[] args) {

		// Replace the symbol with valuse

		double a = 3.4; 
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		double e = 44.5;
		double f = 5.9;

		double x = (e * d - b * f) / (a * d - b * c);
		double y = ( a * f - e * c ) / (a * d - b * c);

		System.out.printf("The value for x is: %.2f", x);
		System.out.println();
		System.out.printf("The value of y is:%.2f", y);

    }

} 
