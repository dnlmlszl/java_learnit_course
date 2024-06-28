package Methods.HW;

import java.util.Random;
import java.util.Scanner;

public class MatrixMethod {
	static Scanner scanner = new Scanner(System.in);
	static Random random = new Random();

	public static void main(String[] args) {
		System.out.println("Please specidy matrix size:");
		
		int size = Integer.parseInt(scanner.nextLine());
		
		double[][] matrix = generateMatrix(size);
		
		System.out.println("Initial matrix:");
		printMatrix(matrix);
		System.out.println();
		
		
		System.out.println("How do you  want to rotate matrix:" + System.lineSeparator() + "\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		
		int mode = Integer.parseInt(scanner.nextLine());
		
		double[][] rotatedMatrix = null;
		
		
		switch (mode) {
		case 1:
			rotatedMatrix = rotateMatrix90(matrix);
			System.out.println("90 degrees rotated:" + System.lineSeparator());
			
			break;
		case 2:
			rotatedMatrix = rotateMatrix180(matrix);
			System.out.println("180 degrees rotated:" + System.lineSeparator());
			
			break;
		case 3:
			rotatedMatrix = rotateMatrix270(matrix);
			System.out.println("270 degrees rotated:" + System.lineSeparator());
			
			break;
		default:
			System.out.println("You selected non-existing mode!");
			return;
			
		}
		
		printMatrix(rotatedMatrix);
		
	}

	private static void printMatrix(double[][] matrix) {
		for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
	}

	private static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				matrix[i][j] = random.nextDouble(10);
				
			}
		}
		return matrix;
	}
	private static double[][] rotateMatrix90(double[][] matrix) {
		int size = matrix.length;
		double [][] rotatedMatrix = new double[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				rotatedMatrix[j][size - 1 - i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}
	private static double[][] rotateMatrix180(double[][] matrix) {
		int size = matrix.length;
		double [][] rotatedMatrix = new double[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				rotatedMatrix[size - 1 - i][size - 1 - j] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

	private static double[][] rotateMatrix270(double[][] matrix) {
		int size = matrix.length;
		double [][] rotatedMatrix = new double[size][size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				rotatedMatrix[size - 1 - j][i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}
}
