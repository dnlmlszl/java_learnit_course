package Methods.HW;

import java.util.Scanner;

public class DrawRectangle {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please, enter height of rectangle: ");
		int height = Integer.parseInt(scanner.nextLine());
		System.out.println("Please, enter width of rectangle: ");
		int width = Integer.parseInt(scanner.nextLine());
		
		drawRectangle(height, width);
		

	}
	
	private static void drawRectangle(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0 || j == width - 1 || i == 0 || i == height -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
