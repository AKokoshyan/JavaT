import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		System.out.println("Enter number for rows and columns of a matrix : ");
		int rowsColumnsMatrix = validateLength();

		int[][] matrix = new int[rowsColumnsMatrix][rowsColumnsMatrix];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println(
						"Enter value for element in position " + (i + 1) + " " + (j + 1) + " in range 1 to 20 !");
				matrix[i][j] = validateElement();
			}
		}

		int previousSumRows = 0;
		int currentSumRows = 0;
		int previousSumColumns = 0;
		int currentSumColumns = 0;
		int sumLeftDiagonal = 0;
		int sumRightDiagonal = 0;
		boolean isMagicalSquare = true;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == 0) {
					previousSumRows += matrix[i][j];
					currentSumRows += matrix[i][j];
					previousSumColumns += matrix[j][i];
					currentSumColumns += matrix[j][i];
				} else {
					currentSumRows += matrix[i][j];
					currentSumColumns += matrix[j][i];
				}

				if (i == j) {
					sumLeftDiagonal += matrix[i][j];
				}
				if (i + j == matrix.length - 1) {
					sumRightDiagonal += matrix[i][j];
				}
			}
			if (previousSumRows != currentSumRows || previousSumColumns != currentSumColumns) {
				isMagicalSquare = false;
				break;
			}
			currentSumColumns = 0;
			currentSumRows = 0;
		}

		if (isMagicalSquare) {
			if (sumLeftDiagonal != sumRightDiagonal) {
				isMagicalSquare = false;
			}
		}

		System.out.println(isMagicalSquare);
	}

	public static int validateLength() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you enter is negative or equal to 0! Please try agian !\nEnter your number : ");
			}
		} while (input < 1);
		return input;
	}

	public static int validateElement() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1 || input > 20) {
				System.out.println("The number that you entered is not in the range 1 to 20! Please try again!");
			}
		} while (input < 1 || input > 20);
		return input;
	}

}
