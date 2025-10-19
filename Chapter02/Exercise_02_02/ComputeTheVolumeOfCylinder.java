
/*
 * Exersice 2.2 : Compute the volume of a cylinder
 * Write a program that reads in the radius and length of a cylinder and 
 * Computes the area and volume using the following formula 
 * area = radius * radius * PI 
 * Volume = area * length 
 **/

import java.util.Scanner;

public class ComputeTheVolumeOfCylinder{

	public static void main (String[] args){

		// takinging input from user 
		Scanner input = new Scanner(System.in );


		//propmt user
		final double Pi = 3.14159; // Declare a constant 

		System.out.println("Enter the radius and length of cylinder: ");
		double radius = input.nextDouble();
		double length = input.nextDouble();

		double area = radius * radius * Pi;
		double volume = area * length ;

		//Display Output 
		
		System.out.println("The Area is: " +  area );
		System.out.println("The volume is:" +  volume);

		input.close();

	}

}	
