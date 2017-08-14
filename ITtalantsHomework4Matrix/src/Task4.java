
public class Task4 {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int[][] matrixOne = new int[4][4];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrixOne[i][j] = matrix[matrix[i].length - 1 - j][i];
			}
		}

		for (int i = 0; i < matrixOne.length; i++) {
			for (int j = 0; j < matrixOne[i].length; j++) {
				System.out.print(matrixOne[i][j] + " ");
			}
			System.out.println();
		}
	}

}
