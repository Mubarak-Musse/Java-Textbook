

/*Exercise 3.4 (Random Month)
 * Write a program that randomly generate an integer between 1 & 12
 * Display the English moht names for example:
 * 	January , February ,...., Decemper 
 * and for the numbers 
 * 	1, 2,....,12, accordingly 
 *
 * **/

import java.util.Random; 

public class RandomMonth {

	public static void main (String[] args) {

		Random random = new Random ();

		int number = random.nextInt(1, 13);

		switch(number) {
			case 1: System.out.print( number + " = January");
				break;
			case 2: System.out.print(" = Febrary");
				break;
			case 3: System.out.print(number + " = March");
				break;
			case 4: System.out.print(number + " = April");
				break;
			case 5: System.out.print(number + " = May");
				break;
			case 6: System.out.print(number + " = June");
				break;
			case 7: System.out.print(number + " = July");
				break;
			case 8: System.out.print(number + " = August");
				break;
			case 9: System.out.print(number + " = September");
				break;
			case 10: System.out.print(number + " = October");
				break;
			case 11: System.out.print(number + " = November");
				break;
			case 12: System.out.print(number + " = December");
				break;
			default: System.out.println (" Invalid values");
		}
	}
}
