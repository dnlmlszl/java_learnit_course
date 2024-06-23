package operators.typeOfExpressions;
import java.util.Scanner;

public class ReadUserInput {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter any word: ");
		String newWord = scanner.nextLine();
		System.out.println("You entered: " + newWord);
		System.out.print("Please, enter any integer number: ");
		int i = scanner.nextInt();
		System.out.println("You entered this integer number: " + i);

	}

}
