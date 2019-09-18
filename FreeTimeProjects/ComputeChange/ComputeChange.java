import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args) {
	
	//create scanner class
	Scanner input = new Scanner(System.in);
	
	//Receive the amount of money
	System.out.print("Enter the amount of money E.G $5.56 etc : ");
	double amount = input.nextDouble();
	
	int remainingAmount = (int)(amount * 100);
	
	//find the number of dollars
	int numberOfOneDollars = remainingAmount / 100;
	remainingAmount = remainingAmount % 100;
	
	//find the number of quarters in the remaining amount
	int numberOfQuaters = remainingAmount / 25;
	remainingAmount = remainingAmount % 25;
	
 	//find the number of dimes in the remaining amount
 	int numberOfDimes = remainingAmount / 10;
 	remainingAmount = remainingAmount % 10;
 	
 	//find the number of nickels in the remaining amount
 	int numberOfNickels = remainingAmount / 5;
 	remainingAmount = remainingAmount % 5;
 	
 	//Find the number of pennies in the remaining amount
 	int numberOfPennies = remainingAmount;
 	
 	//display results
 	System.out.println("Your amount " + amount + " consists of");
 	System.out.println("          " + numberOfOneDollars + ": Dollars");
	System.out.println("          " + numberOfQuaters + ": Quarters");
	System.out.println("          " + numberOfDimes + ": Dimes");
	System.out.println("          " + numberOfNickels + ": Nickels");
	System.out.println("          " + numberOfPennies + ": Pennies");
	}


}