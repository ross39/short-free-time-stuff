//this program allows the user to compute loan payments

import java.util.Scanner;

public class ComputeLoan {
	public static void main(String[] args) {
	
	//create a scanner
	Scanner input = new Scanner(System.in);
	
	//enter annual intrest rate in percentage,e.g 5% APR etc....
	System.out.print("Enter Annual Intrest Rate E.G 5% APR : ");
	double annualIntrestRate = input.nextDouble();
	
	//obtain monthly intrest rate
	double monthlyIntrestRate = annualIntrestRate / 1200;
	
	//Enter Number of years
	System.out.print("Enter number of years as an integer E.G 5 years : ");
	int numberOfYears = input.nextInt();
	
	//Enter loan amount
	System.out.print("Enter loan amount E.G 12000.95 ETC : ");
	double loanAmount = input.nextDouble();
	
	//calculate payment
	double monthlyPayment = loanAmount * monthlyIntrestRate / (1 - 1 / Math.pow(1 + monthlyIntrestRate, numberOfYears * 12));
	double totalPayment = monthlyPayment * numberOfYears * 12;
	
	//Display results
	System.out.println("The monthly payment is $" + (int)(monthlyPayment * 100) / 100.0);
	System.out.println("The total payment is $" + (int)(totalPayment * 100) / 100.0);
	
	}


}