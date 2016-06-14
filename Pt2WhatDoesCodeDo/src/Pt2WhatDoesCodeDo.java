


	import java.util.Scanner;

	public class Pt2WhatDoesCodeDo {
	 
	 public static void main(String[] args) {
	 
	 //prepare for data entry by the user	 
	 Scanner keyboard = new Scanner(System.in);
	 //initialize variables
	 double loan = 0;
	 double interestRate = 0;
	 double monthlyPayment = 0;
	 double balance = 0;
	 int compoundPeriod = 0;
	 int term;
	 
	 //Obtain data input from user
	 System.out.printf("Enter the loan amount: ");
	 loan = keyboard.nextDouble();
	 
	 System.out.printf("Enter the interest rate on the loan: ");
	 interestRate = keyboard.nextDouble();
	 
	 System.out.printf("Enter the term(years) for the loan payment: ");
	 term = keyboard.nextInt();
	 
	 System.out.printf("\n================================================================\n");
	 //end data entry
	 keyboard.close();
     //call Method to calculate monthly payment using loan, interestRate, term
	 monthlyPayment = getMonthlyPayment(loan, interestRate, term);
	 //determine mortgage balance
	 balance = -(monthlyPayment * (term * 12));
	 //print output - balance and minimum monthly payment
	 System.out.format("%-30s$%-+10.2f%n", "Amount owed to bank:", balance);
	 System.out.format("%-30s$%-10.2f%n", "Minimum monthly payment:", monthlyPayment);
	 }

	 /**
	 * Calculate the monthly payment of a loan.
	 * 
	 * @param amt: Amount borrowed for Load
	 * @param interestRate: Interest rate on the loan
	 * @param term: Repayment term in years 
	 * @returns The monthly payment of a loan given the interest rate, amount and term (years) 
	 */
	 
	 //method to calculate monthly payment using loan, interestRate, term
	 public static double getMonthlyPayment(double amt, double interestRate, double term) {
	 double rate = (interestRate / 100) / 12;
	 double base = (rate + 1);
	 double months = term * 12;
	 double result = 0;
	 //calculate
	 result = amt * (rate * (Math.pow(base, months)) / ((Math.pow(base, months)) - 1)); 
	 
	 return result;
	 }


	}

