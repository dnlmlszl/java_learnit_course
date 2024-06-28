package Methods.HW;

import java.util.Scanner;

public class ConvertDecimalToRoman {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		mainLoop: while (true) {
			System.out.print("Please, select mode. If you want to convert Roman "
					+ "numbers to decimal - type 'R2D' and press enter."
					+ System.lineSeparator()
					+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");
			
			String mode = scanner.nextLine();
			
			if (mode.equalsIgnoreCase("R2D")) {
				subLoop: while (true) {					
					System.out.println("Please, enter Roman number you want to convert: ");
					String romanNumber = scanner.nextLine();
					if (romanNumber.isEmpty()) break subLoop;
					if (isRomanNumberValid(romanNumber)) {
						System.out.println(roman2Decimal(romanNumber));
						continue;
					} else {
						System.out.println("You entered invalid Roman number. "
								+ "Please, try one more time.");
						continue;
					}
					
				}
				
			} else if (mode.equalsIgnoreCase("D2R")) {
				sub2Loop: while (true) {
					System.out.print("Please, enter decimal number "
							+ "you want to convert: ");
					int decimalNumber = scanner.nextInt();
					
					if (decimalNumber == 0) break sub2Loop;
					
					if (isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						continue;
					} else {
						System.out.println("Please, enter positive integer from 1 to 100.");
						continue;
					}

				}
			}
			System.out.println("Please, enter 'R2D' or 'D2R.");
		}

	}
	public static String decimal2Roman(int number) {
		String[] a = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "D", "M" };
		int[] b = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 500, 1000 };
		StringBuilder s = new StringBuilder();
		for (int i = a.length - 1; i >= 0; i--) {
			while (number >= b[i]) {
				s.append(a[i]);
				number -= b[i];
			}
		}
		return s.toString();
	}
	public static int roman2Decimal(String romanNumber) {
		String romanNumeral = romanNumber.toUpperCase();
		
		int decimal = 0;
		int lastNumber = 0;
		
		for (int x = romanNumeral.length() - 1; x >= 0; x--) {
			char convertToDecimal = romanNumeral.charAt(x);

			switch (convertToDecimal) {
			case 'M':
				decimal = processDecimal(1000, lastNumber, decimal);
				lastNumber = 1000;
				break;

			case 'D':
				decimal = processDecimal(500, lastNumber, decimal);
				lastNumber = 500;
				break;

			case 'C':
				decimal = processDecimal(100, lastNumber, decimal);
				lastNumber = 100;
				break;

			case 'L':
				decimal = processDecimal(50, lastNumber, decimal);
				lastNumber = 50;
				break;

			case 'X':
				decimal = processDecimal(10, lastNumber, decimal);
				lastNumber = 10;
				break;

			case 'V':
				decimal = processDecimal(5, lastNumber, decimal);
				lastNumber = 5;
				break;

			case 'I':
				decimal = processDecimal(1, lastNumber, decimal);
				lastNumber = 1;
				break;

			}

		}
		return decimal;
		
	}
	private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
		if (lastNumber > decimal) {
			return lastDecimal - decimal;
		} else {
			return lastDecimal + decimal;
		}
	}
	public static boolean isRomanNumberValid(String romanNumber) {
		return romanNumber
				.matches("^(?i)M{0,3}(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
	}
	
	public static boolean isDecimalNumberValid(int decimalNumber) {
		return decimalNumber > 0 && decimalNumber <= 100;
	}

}
