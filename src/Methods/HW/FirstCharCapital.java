package Methods.HW;

import java.util.Scanner;

public class FirstCharCapital {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Please, enter any text: ");
		String userInput = scanner.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}
	
	public static String firstCharToTitleCase(String string) {
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i])) {
				found = false;
			}
		}
		return String.valueOf(chars);
	}

}
