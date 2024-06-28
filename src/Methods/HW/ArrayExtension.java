package Methods.HW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();
	public static final int MULTIPLIER = 2;

	public static void main(String[] args) {
		
		System.out.println("Please, enter length of initial array: ");
		int baseArrayLength = Integer.parseInt(scanner.nextLine());
		int[] arr = generateRandomArray(baseArrayLength);
		int[] extendedArray = extendArray(arr);
		
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extendedArray));

		
	}
	
	public static int[] extendArray(int[] arr) {
		int newArrayLenght = arr.length * 2;
		int[] resultArray = Arrays.copyOf(arr, newArrayLenght);
		
		for (int i = arr.length; i < newArrayLenght; i++) {
			resultArray[i] = arr[i - arr.length] * MULTIPLIER;
		}
		
		return resultArray;
	}

	public static int[] generateRandomArray(int amountOfElements) {
		
		int[] resultArray = new int[amountOfElements];
		for (int i = 0; i < amountOfElements; i++) {
			resultArray[i] = random.nextInt(100) + 1;
		}
		return resultArray;
	}

}
