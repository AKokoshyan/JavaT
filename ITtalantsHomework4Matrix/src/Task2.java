import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of rows and coluns of the matrix! Enter positive or greater than 0 number !");
		int rowsColuns = validateRowsColuns();

		int[][] matrix = new int[rowsColuns][rowsColuns];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter value for element in position " + (i + 1) + " " + (j + 1) + " : ");
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Your 2D array is : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("The left diagonal is : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.print("The right diagonal is : ");
		int iteratBack = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = matrix[i].length - 1; j >= 0; j--) {
				if (j == matrix[i].length - 1 - iteratBack) {
					System.out.print(matrix[i][j] + " ");
					iteratBack++;
					break;
				}
			}
		}
	}

	public static int validateRowsColuns() {
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
