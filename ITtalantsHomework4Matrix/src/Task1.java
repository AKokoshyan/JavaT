import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number for rows of the matrix :");
		int matrixRows = validateLength();

		System.out.println("Enter a number for columns of the matrix : ");
		int matrixColumns = validateLength();

		int[][] matrix = new int[matrixRows][matrixColumns];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter element on position " + (i + 1) + " " + (j + 1));
				matrix[i][j] = scanner.nextInt();
			}
		}

		int maxNumber = matrix[0][0];
		int minNumber = matrix[0][0];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (maxNumber < matrix[i][j]) {
					maxNumber = matrix[i][j];
				}
				if (minNumber > matrix[i][j]) {
					minNumber = matrix[i][j];
				}
			}
		}
		System.out.println(minNumber + " " + maxNumber);
	}

	public static int validateLength() {
		Scanner scanner = new Scanner(System.in);
		int input;

		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you entered is negative or equal to 0! Please try again!\nEnter your number : ");
			}
		} while (input < 1);
		return input;

	}
}
