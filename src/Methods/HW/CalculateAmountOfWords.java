package Methods.HW;
import java.util.Scanner;

public class CalculateAmountOfWords {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Please, enter any text: ");
		
		String input = scanner.nextLine();
		
		int amountOfWords = getWordsAmount(input);
		
		System.out.println("Amount of words in your text: " + amountOfWords);

	}
	
	private static int getWordsAmount(String text) {
		return text.split("[\\p{P}\\s]+").length;
	}

}
