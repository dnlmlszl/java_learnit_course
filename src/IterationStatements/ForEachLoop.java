package IterationStatements;

public class ForEachLoop {

	public static void main(String[] args) {
		System.out.println("========== forEach loop");
		
		int[] arr = {1, 2, 3};
		int sum = 0;
		
		for (int num : arr) {
			sum += num;
			System.out.println("Number: " + num);
		}
		
		System.out.println("Sum: " + sum);

	}

}
