//this program calculates the tax of a sale and adds it to the price

import java.util.Scanner;

public class SalesTax {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter purchase amount");
	double purchaseAmount = input.nextDouble();
	
	double tax = purchaseAmount * 0.125;
	System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
	
	}

}