


// Write a programm that can be computed using the following formula  
// PI =  4 * (1 - 1/3 + 1/5 - 1/7  + 1/9 - 1/11 + 1/13 ) 
// PI = 4 * (1 - 1/3 + 1/5 - 1/7  + 1/9 - 1/11 + 1/13 )
// Use 1.0 instead of 1 in your program
//

public class ApproximatePi{

	public static void main(String[] args){

		double Pi_1 = (1.0 - (1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 ));
		double Pi_2 = (1.0 - (1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 /13 ));

		System.out.println("Pi = " + 4 * Pi_1);
        System.out.println("Pi_2 = " + 4 * Pi_2);
	}
}


