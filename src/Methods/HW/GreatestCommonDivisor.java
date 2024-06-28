package Methods.HW;

import java.util.Scanner;

public class GreatestCommonDivisor {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Please, enter two numbers separated by space: ");
		String userInput = scanner.nextLine();
		
		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);

		System.out.println(gcdRecursive(number1, number2));

	}

	public static int gcdRecursive(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			//for the case firstNumber is negative
			return Math.abs(firstNumber); 
		} else {
			return gcdRecursive(secondNumber, firstNumber % secondNumber);
		}
		
	}
}
