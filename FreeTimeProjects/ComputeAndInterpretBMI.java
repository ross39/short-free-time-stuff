import java.util.Scanner;

public class ComputeAndInterpretBMI {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	//prompt the user to enter their weight in kilos
	System.out.print("Enter weight in kilos: ");
	double weight = input.nextDouble();
	
	//prompt the user to enter their height in meters
	System.out.print("Enter height in meters: ");
	double height = input.nextDouble();
	
	//calculate BMI
	double bmi = weight / (height * height);
	
	//display results
	System.out.println("BMI is " + bmi);
	if (bmi < 18.5)
		System.out.println("You are underweight. This can have serious health risks");
	else if (bmi < 25)
		System.out.println("You are of a normal BMI. Good job!");
	else if (bmi < 30)
		System.out.print("You are overweight. you need to keep an eye on your weight");
	else 
		System.out.println("You are obese. See a doctor");
		
	
	}

}