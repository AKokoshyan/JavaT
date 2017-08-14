import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int lengthArray = validateLengthArray();

		double[] array = new double[lengthArray];

		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextDouble();
			sum += array[i];
		}

		double avarageSum = sum / lengthArray;

		for (int i = 0; i < array.length - 2; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (j == i) {
					continue;
				}
				for (int k = 0; k < array.length; k++) {
					if (k == j || k == j) {
						continue;
					}
					if (array[i] + array[j] + array[k] == avarageSum) {
						System.out.println(array[i] + " " + array[j] + " " + array[k]);
					}
				}
			}
		}

	}

	public static int validateLengthArray() {
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
