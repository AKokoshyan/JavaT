import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int lengthArray = validateLengthArray();

		int[] array = new int[lengthArray];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextInt();
		}

		int temp = 0;
		int reverse = 1;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - reverse] = temp;
			reverse++;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
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
