package operators.homework;

import java.util.Scanner;

public class Parameters {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		write_sum();
		write_area();
		write_circumference();

	}

	private static void write_sum() {
		System.out.println("Enter a number: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter a number: ");
		int num2 = Integer.parseInt(scanner.nextLine());
		summarize(num1, num2);
	}
	
	private static void write_area() {
		System.out.println("Enter the length of side A: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter the length of side B: ");
		int num2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter the length of side C: ");
		int num3 = Integer.parseInt(scanner.nextLine());
		
		triangleArea(num1, num2, num3);
	}
	
	private static void write_circumference() {
		System.out.println("Enter a radius: ");
		int num1 = Integer.parseInt(scanner.nextLine());
		
		circumference(num1);
	}

	private static void summarize(int num1, int num2) {
		int sum = num1 + num2;
		
		System.out.println("Sum of values: " + sum);
		
	}
	
	private static void triangleArea(int num1, int num2, int num3) {
		double p = (num1 + num2 + num3) / 2;
		
		double area = Math.sqrt(p * (p - num1) * (p - num2) * (p - num3));
				
		System.out.println("Area of triangle: " + area);
		
	}
	
	private static void circumference(int num1) {
		int circumference = (int) (Math.pow(2, num1) * Math.PI);
		
		System.out.println("Circle circumference: " + circumference);
	}

}
