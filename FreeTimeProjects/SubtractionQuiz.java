//this program is simulates a subtraction quiz
//Made by Ross Heaney

import java.util.Scanner;

public class SubtractionQuiz {
	public static void main(String[] args) {
	//Generate two random single-digit integers
	int number1 = (int)(Math.random() *10000000);
	int number2 = (int)(Math.random() *10000000);
	
	//2 If number < number2, swap number1 with number 2
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		//prompt what is number1 - number 2 ?
		System.out.print(" what is " +number1 + "-" +number2 + "? :");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		//grade the answer and display the result 
		if (number1 - number2 == answer)
			System.out.print("Congratulations! Your answer is correct!!!");
		else {
			System.out.println("Oops!! I'm afraid you have the wrong answer");
			System.out.println(number1 + "-" + number2 + "should be: " + (number1 - number2));
			} 
	
	
	}
}