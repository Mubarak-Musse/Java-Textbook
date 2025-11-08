

/*
 * Physics Accelerations 
 * Write a program that prompt the user to enter the starting velocity
 * Vo in meters/ second 
 * a = ( V1 - Vo ) / t 
 *
 * */

import java.util.Scanner;

public class physicsAcceleration { 

	public static void main (String[] args) {

		//Create a Scanner Object 
        Scanner input = new Scanner(System.in);

        //prompt user 
        System.out.print( "Enter the Starting Velocity Vo and" + 
                        " Vi in meters/s and time span:" );
        double intialVelocity = input.nextDouble();
        double endingVelocity = input.nextDouble();
        double timeSpan = input.nextDouble();

        // Calculate valus //

        double averageAcceleration = ((endingVelocity - intialVelocity ) / timeSpan);

        System.out.printf(" The average acceleration is:%.6f \n", averageAcceleration );


        }
}

