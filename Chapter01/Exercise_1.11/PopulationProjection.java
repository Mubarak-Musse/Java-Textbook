
/*
 * The U.S. Cnsus Bureau project population based on the following assumption
 *	1. One Birth every 7 Secounds 
 *	2. One Death every 13 Secound 
 *	3. One new immigrant evey 45 Secound
 *Write a program to display the population for each of the next 5 years
   Assume the following 
   	- Current population = 312.032.489 
	- year = 365 days 
 * Hint -- > Java if 2 integers perform division the result is Int**/


public class PopulationProjection { 

	public static void main (String[] args){

		//Current Population
		double currentPopulation = 312_032_486;

		// Calculating Secounds in year 
		double secoundPerYear = 365 * 24 * 60 * 60; 

		// Calcualate annual changes 
		
		double birthPerYear = secoundPerYear / 7 ; 
		double deathPerYear = secoundPerYear / 13;
		double immigrantPerYear = secoundPerYear / 45;

		// Net Population Changes Per Year 

		double netChangePerYear = birthPerYear - deathPerYear + immigrantPerYear ; 
		// Display population for next 5 years 
		
		System.out.println("Population Projection for the next 5 years: " + netChangePerYear);

		
	}
} 
