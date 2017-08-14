import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive number for length of an array : ");
		int lengthArray = validateLengthArray();

		int[] array = new int[lengthArray];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextInt();
		}

		int counter = 1;
		int length = 1;
		int biggestElement = 0;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				counter++;
			} else {

				if (length < counter) {
					length = counter;
					biggestElement = array[i];
					counter = 1;
				}
			}
		}
		if (length < counter) {
			length = counter;
			biggestElement = array[array.length - 1];
			counter = 1;
		}

		for (int i = 0; i < length; i++) {
			System.out.print(biggestElement + " ");
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
