package Methods.HW;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxValue {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter as much numbers you like, 0 stops:");
		ArrayList<Integer> numbers = new ArrayList<>();
		
		while (true) {
			int input = Integer.parseInt(scanner.nextLine());
			
			if (input == 0) break;
			
			numbers.add(input);
		}
		
		int[] intArray = numbers.stream().mapToInt(i -> i).toArray();
		
		int maxNum = findMaxIntInArray(intArray);
		
		System.out.println(maxNum);

	}

	private static int findMaxIntInArray(int[] intArray) {
		int maxNum = intArray[0];
		
		for (int num : intArray) {
		
			if (num > maxNum) {
				maxNum = num;
			}
		}
		return maxNum;
	}

}
