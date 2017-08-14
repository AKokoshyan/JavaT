import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a positive number and greater than 0 for length of array and program will make new array of elements of first array which are in range -2.99 ti 2.99");
		int lengthArray = validateLengthArray();

		double[] array = new double[lengthArray];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextDouble();
		}

		int secondArrayLength = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > -2.99 && array[i] < 2.99) {
				secondArrayLength++;
			}
		}

		double[] arrayTwo = new double[secondArrayLength];

		int currentElement = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > -2.99 && array[i] < 2.99) {
				arrayTwo[currentElement] = array[i];
				currentElement++;
			}
		}

		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + " ");
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
