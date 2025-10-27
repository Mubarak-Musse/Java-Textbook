
// Sum the digit in an integer 
/*
 * Write a program that reads an integer between 0 to 1000
 * and Adds all the digit in the interger 
 * For Example: if an int is 932 the sum of all its digit is 14
 * Hint 
 * 	1- Use the % operator to extract digits 
 * 	2. Use the / Operator to remove the extracted digit 
 *
 * **/

import java.util.Scanner; // Scanner is in the java.util package 

public class SumTheDigitInAnInteger { 

	public static void main (String[] args ){

		//Create a Scanner object 
		Scanner input = new Scanner(System.in);


		System.out.println("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();
        
        int lastDigit = number % 10 ;
        int remainingNumber = number / 10;
        int secondLastDigit = remainingNumber % 10;
        int thirdLastDigit = remainingNumber % 10;
        int sum = lastDigit + secondLastDigit + thirdLastDigit;
        

        // Dispaly output
        
        System.out.println("The Sum of all digit in " +
                number + " is " + sum );

    }
}
