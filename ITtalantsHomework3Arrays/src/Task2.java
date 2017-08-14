import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive number or greater than 0 for length of an array : ");
		int arrayLength = validateArrayLength();

		int secondArrayLength = arrayLength * 2;

		int[] firstArray = new int[arrayLength];
		int[] secondArray = new int[secondArrayLength];

		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			firstArray[i] = scanner.nextInt();
		}

		int incrementOdd = 2;
		int incrementEven = 1;

		for (int i = 0; i < secondArray.length; i++) {
			if (secondArrayLength % 2 != 0) {
				if (i < (secondArray.length / 2) + 1) {
					secondArray[i] = firstArray[i];
				} else {
					secondArray[i] = firstArray[i - incrementOdd];
					incrementOdd += 2;
				}
			} else {
				if (i < secondArray.length / 2) {
					secondArray[i] = firstArray[i];
				} else {
					secondArray[i] = firstArray[i - incrementEven];
					incrementEven += 2;
				}
			}
		}

		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i]);

		}

	}

	public static int validateArrayLength() {
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
