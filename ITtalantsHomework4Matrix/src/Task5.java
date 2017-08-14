import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rowsColumnsMatrix = validateLength();

		int[][] matrix = new int[rowsColumnsMatrix][rowsColumnsMatrix];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("Enter value for element in position " + (i + 1) + " " + (j + 1));
				matrix[i][j] = scanner.nextInt();
			}
		}

		int maxSumRows = 0;
		int currentSumRows = 0;
		int maxSumColumns = 0;
		int currentSumColumns = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				currentSumRows += matrix[i][j];
				currentSumColumns += matrix[j][i];
			}
			if (maxSumRows < currentSumRows) {
				maxSumRows = currentSumRows;
			}
			if (maxSumColumns < currentSumColumns) {
				maxSumColumns = currentSumColumns;
			}
			currentSumColumns = 0;
			currentSumRows = 0;

		}

		if (maxSumRows > maxSumColumns) {
			System.err.println("The sum of rows " + maxSumRows + " is bigger than the sum of columns " + maxSumColumns);
		} else {
			System.out.println(
					"The sum of columns " + maxSumColumns + " is bigger than the sum of columns " + maxSumRows);
		}

	}

	public static int validateLength() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you entered is negative or equal to 0! Please try again !\nEnter your number :");
			}
		} while (input < 1);
		return input;
	}
}
