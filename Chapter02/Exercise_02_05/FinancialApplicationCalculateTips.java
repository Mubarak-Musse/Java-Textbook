



/* (Financial Application : Calculate Tips)
 * Write a program that reads the subtotal and the gratuity rate
 * ten compute gratuity and total 
 * **/

import java.util.Scanner;

public class FinancialApplicationCalculateTips {

	public static void main (String[] args) { 
		// Create Scanner
		Scanner input = new Scanner (System.in);
		
		// Receive input from user 
		System.out.println("Enter the Subtotal and Gratuity Rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();

		double gratuity = (gratuityRate / 100 ) * subtotal ; 
		double total = gratuity + subtotal ;

		// Display result 
		System.out.println("The gratuity is " +gratuity+ " and total "+total);
	}

}
