package Methods.HW;

import java.util.Scanner;

public class SumDigitsInNumber {
	static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		
		System.out.print("Please, enter integer: ");
		int number = scanner.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
		
	}
	
	private static int sumDigitsInNumber(int number) {
		int result = 0;
		while (number != 0) {
			result += number % 10;
			number /= 10;
		}
		return Math.abs(result);
		
	}

}
