



/*Exersise 3.2 (Game add three numbers)
 * The program in listing 3.1 Addition Quiz**/

import java.util.Scanner;

public class GameAddThreeNumbers { 

	public static void main (String[] args) {

		//TODO: Generate Random values 
		int number1 = (int)(System.currentTimeMillis() % 10 );
		int number2 = (int)(System.currentTimeMillis() / 10 % 10);
		int number3 = (int)(System.currentTimeMillis() / 10 % 10); 

		//Create a Scanner 
		Scanner input = new Scanner(System.in);

		System.out.print("What is " + number1 +" + "+ number2 + " + " + number3 + "?: ");
		int answer = input.nextInt();

		System.out.println( number1 + " + " + number2 + " + " + number3 " = " + answer + " is " + (number1 + number2 + number3 == answer));

	}
}


