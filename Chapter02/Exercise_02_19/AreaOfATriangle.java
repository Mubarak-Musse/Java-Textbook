



/*
 * Exercise 2.19 (Geometry: Area of triangle)
 * Write a program that prompts the user to enter 3 points 
 *  side 1 of triangle = x1  , y1
 *  side 2 of triangle = x2 , y2 
 *  side 3 of triangle = x3 , y3 
 *  **/

import java.util.Scanner;

public class AreaOfATriangle {

	public static void main ( String [] args ) {

		//creating scanner obejects 
		
		Scanner input = new Scanner(System.in);

		//Prompt user 

		System.out.println("Enter the coordinates of 3 points"+
		" sepeperated by spacs like x1 y1 x2 y2 x3 y3: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double side1 = Math.pow(Math.pow(x1 - x2, 2) + Math.pow() +; 
		double side2 = Math.pow(Math.pow(x2 - x3) +;
		double side3 = Math.pow(Math.pow(x1 - x3) +;

		/*Compute the result*/

		double totalSide = (side1 + side2 + side3) / 2;

		double traingleSide = (Math.pow(totalSide*(totalSide - side1)*(totalSide - side2)*(totalSide - side3), .5));

		/*Display output*/

		System.out.pritnln ("The Area of The Triangle is: " + (int)traingleSide);
		
	}
}


