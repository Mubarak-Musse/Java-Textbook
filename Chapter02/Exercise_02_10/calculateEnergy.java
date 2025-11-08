


// Exe: 2.10 Science :Calculating Energy 
// Write a program that calculate the energy needed to heat water 
/* from an initial temperature to a final termprature
 * Your Program should prompt the user to enter the amount of water
 * in kilogram also the initial and final temperatur of the water
 * the formual compute the energy 
 * Q = M * (finalTemperatur - initialTemperature) * 4184 ;
 * 	where M = Weight of Water in Kilogram
 * 	Initial & Final Temperature are in Degrees Celsius
 * 	Q = Energy measured in joules
 *
 * **/

import java.util.Scanner ;

public class calculateEnergy {

	public static void main (String[] args){

		Scanner input = new Scanner(System.in);

		/*Prompt the User to enter values**/
		System.out.println("Enter the amount of water in kilogram:");
		double water = input.nextDouble();
		System.out.println("Enter The Initial Temperature:");
		double intialTemperature = input.nextDouble();
		System.out.println("Enter The Final Temperature: ");
		double finalTemperature = input.nextDouble();

		/*Computing the energy needed **/
		
		double energy = (water * (finalTemperature - intialTemperature) * 4184);

		/*Display output */
		System.out.println("The Energy Needed is \n" + energy);
	}
}


