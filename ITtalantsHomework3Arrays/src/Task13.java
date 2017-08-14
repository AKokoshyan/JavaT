import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		int repeatInput = inputNumber;

		int arrayLength = 0;
		while (repeatInput > 0 || repeatInput < 0) {
			repeatInput /= 2;
			arrayLength++;
		}

		int[] array = new int[arrayLength];

		repeatInput = inputNumber;
		for (int i = array.length - 1; i >= 0; i--) {
			array[i] = repeatInput % 2;
			repeatInput /= 2;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
