import java.util.Scanner;

public class Task1 {
	/**
	 * To be made a program which is reading number for length of an array and
	 * to print the smallest number which is divisible by 3!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive number or greater than 0 for length of an array : ");
		int arrayLength = validateInput();

		int[] array = new int[arrayLength];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element :");
			array[i] = scanner.nextInt();
		}

		int minNumber = array[0];

		for (int i = 0; i < array.length; i++) {
			if (minNumber > array[i] && array[i] % 3 == 0) {
				minNumber = array[i];
			}
		}

		if (minNumber % 3 != 0) {
			System.out.println("There is no number in the array divisible by 3 !");
		} else {
			System.out.println("The smallest number in the array divisible by 3 is " + minNumber);
		}

	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println("The number that you enter is negative or equal to 0! Please try again !");
			}
		} while (input < 1);
		return input;
	}
}
