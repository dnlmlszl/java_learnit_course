package IterationStatements;

import java.util.Scanner;

public class HomeWork {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Task 01 - Please enter a valid number between 1.000 and 100.000: ");
		
		String input = scanner.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			System.out.println(c);
		}
		
		System.out.println("Task 02 - Enter the height of the pyramid: ");
		
		int size = Integer.parseInt(scanner.nextLine());
		
		for (int i = 1; i <= size; i++) {
	           for (int x = 1; x <= i; x++) {
	               System.out.print("*");
	           }

	           System.out.println();
	       }	
		
		for (int i = size - 1; i >= 1; i--) {
	           for (int x = 1; x <= i; x++) {
	               System.out.print("*");
	           }

	           System.out.println();
	       }
		
		System.out.println("Task 03 - Print matrix: ");
		
		int mat[][] = {
				{1, 2, 3, 4, 5},
				{6, 7},
				{8, 9, 10}
		}; 
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
