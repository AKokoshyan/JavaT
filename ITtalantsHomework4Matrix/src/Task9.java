import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		System.out.println("Enter a number for rows of a matrix in range 3 to 10!");
		int rowsMatrix = validateRowsMatrix();

		System.out.println("Enter a number for columns of a matrix in range 3 to 10 and not equal to " + rowsMatrix);
		int columnsMatrix = validateColumnsMatrix(rowsMatrix);

		int[][] matrix = new int[rowsMatrix][columnsMatrix];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(
						"Enter value for element in position " + (i + 1) + " " + (j + 1) + " in range 1 to 30 !");
				matrix[i][j] = validateElements();
			}
		}
		int squareMatrixLength = 0;
		if (rowsMatrix > columnsMatrix) {
			squareMatrixLength = rowsMatrix;
		} else {
			squareMatrixLength = columnsMatrix;
		}

		int[][] matrixTwo = new int[squareMatrixLength][squareMatrixLength];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrixTwo[i][j] = matrix[i][j];
			}
		}

		for (int i = 0; i < matrixTwo.length; i++) {
			for (int j = 0; j < matrixTwo.length; j++) {
				System.out.print(matrixTwo[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int validateRowsMatrix() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 3 || input > 10) {
				System.out.println("The number that you enter is out of range 3 to 10! Please try again !");
			}
		} while (input < 3 || input > 10);
		return input;
	}

	public static int validateColumnsMatrix(int rows) {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if ((input < 3 || input > 10) || (input == rows)) {
				if (input == rows) {
					System.out.println("The number that you enter is equal to " + rows
							+ " which you enter!Please enter number in range 3 to 10 and not equal to " + rows
							+ "! Please try again!");
				} else {
					System.out.println("The number that you enter is out of range 3 to 10! Please try again! ");
				}
			}
		} while ((input < 3 || input > 10) || (input == rows));
		return input;
	}

	public static int validateElements() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1 || input > 30) {
				System.out.println("The number that you enter is out of range from 1 to 30! Please try again!");
			}
		} while (input < 1 || input > 30);
		return input;
	}
}
