


/*
 *Exerise2.20: Financial Applicatoin:Calculate interest
 * Write a program that reads the balance and the annual percnetage interst 
 * rate and dispaly the results
 * formual to calculate the interest rate 
 * 	interest = balance * (annualInterestRate/1200)
 * **/

import java.util.Scanner;

public class FinancialApplication { 

	public static void main (String [] args) { 

		// Scanner objects 
		Scanner input = new Scanner (System.in);


		System.out.print("Enter balance and interest rate(e,g. 3 for 3%):");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = (annualInterestRate /  1200.0 );

		/*Compute interestRate*/
		double interest = balance * monthlyInterestRate;

		System.out.println("the interest is: " + (int)(100 * interest) / 100.0);

	}
}





