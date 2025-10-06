




/*Question 1.10 (Average Speed in miles)
 *
 * Assume that a runner runs 14 kilometers in 45 minutes and 30 seconds
 * Write a program that dispaly the average speed in miles per/ hours 
 * Note 1 mile = 1.6 kilometers**/


public class AverageSpeedInMiles{ 

	public static void main(String[] args) {


		double  distance = 14.0;
		double time = 45.30;

		double averageSpeed = ((14 / 45.30) * 60 / 1.6);


		//System.out.println("AverageSpeed= " +averageSpeed+ " kilometers" );
		
		// Convert to mils 

		System.out.println("AverageSpeed= " + averageSpeed + " Miles" );


	}


}
