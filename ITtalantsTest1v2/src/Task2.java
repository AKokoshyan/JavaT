import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		char[][] chessTable = { { ' ', 'K', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' },
				{ ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }, { ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X' } };

		System.out.println(getChess(chessTable, 6, 1));
	}

	static boolean getChess(char[][] arr, int row, int col) {
		if ((row < 0 || row > arr.length - 1) || (col < 0 || col > arr.length - 1)) {
			return false;
		}
		if (arr[row][col] == 'X') {
			return false;
		}
		if (arr[row][col] == 'K') {
			return true;
		}

		arr[row][col] = '-';

		return getChess(arr, row + 1, col - 2) || getChess(arr, row + 1, col + 2) || getChess(arr, row - 1, col - 2)
				|| getChess(arr, row - 1, col + 2) || getChess(arr, row + 2, col - 1) || getChess(arr, row + 2, col + 1)
				|| getChess(arr, row - 2, col - 1) || getChess(arr, row - 2, col + 1);
	}
}
