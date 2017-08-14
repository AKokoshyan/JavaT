import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter positive number or greater than 0 for rows of the matrix : ");
		int rowsMatrix = validateLength();

		System.out.println("Enter positive number or greater than 0 for coluns of the matrix : ");
		int columnsMatrix = validateLength();

		int[][] matrix = new int[rowsMatrix][columnsMatrix];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Enter value for matrix element in position " + (i + 1) + " " + (j + 1));
				matrix[i][j] = scanner.nextInt();
			}
		}

		int avarageDivider = rowsMatrix * columnsMatrix;
		int sumElementsMatrix = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sumElementsMatrix += matrix[i][j];
			}
		}

		int avarageMatrix = sumElementsMatrix / avarageDivider;

		System.out
				.println("The sum of all elements is " + sumElementsMatrix + "\nThe avarage sum is : " + avarageMatrix);
	}

	public static int validateLength() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you entered is negative or equal to 0! Please try again !\nEnter your number : ");
			}
		} while (input < 1);
		return input;
	}
}
