



/*
 *Exersise:area of a hexagon: Write a program that prompts teh use to enter
 the side of hexagon and display the area:
 	The formula 
		Area = (3 * Math.pow(3, 0.5) / 2 ) * S
	Where s is the length of a side 
*/

import java.util.Scanner;

public class GeometryAreaOfHexagon {

	public static void main (String[] args) {

		//Scanner objects
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the length of the side: ");
		double lengthSide = input.nextDouble();


		//Compute value 

		double Area = ( 3 * Math.pow(3, 0.5) / 2 ) * Math.pow(lengthSide, 2);

		/*Display the result*/
		System.out.printf("The area of the hexagon is:%5f \n", Area);
	}
}

