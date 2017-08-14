import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[6][6];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("Enter value for element in position " + (i + 1) + " " + (j + 1));
				matrix[i][j] = scanner.nextInt();
			}
		}
		int sumFirstRow = 0;
		int sumSecondRow = 0;
		int sumThirdRow = 0;

		for (int i = 1; i < matrix.length; i += 2) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == 1) {
					sumFirstRow += matrix[i][j];
				} else if (i == 3) {
					sumSecondRow += matrix[i][j];
				} else if (i == 5) {
					sumThirdRow += matrix[i][j];
				}
			}
		}

		System.out.println("Sum of elements of 2nd row is " + sumFirstRow + "\nSum of elements of 4to row is "
				+ sumSecondRow + "\nSum of elements of 6th row is " + sumThirdRow
				+ "\nThe sum of all elements of 2nd , 4th and 6th row is "
				+ (sumFirstRow + sumSecondRow + sumThirdRow));
	}

}
