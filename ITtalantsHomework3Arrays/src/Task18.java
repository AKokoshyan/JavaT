import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int lengthArrays = validateLengthArray();

		int[] firstArray = new int[lengthArrays];
		int[] secondArray = new int[lengthArrays];
		int[] thirdArray = new int[lengthArrays];

		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Enter " + (i + 1) + " element of first array :");
			firstArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < secondArray.length; i++) {
			System.out.println("Enter " + (i + 1) + " element of second array :");
			secondArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < thirdArray.length; i++) {
			if (firstArray[i] > secondArray[i]) {
				thirdArray[i] = firstArray[i];
			} else {
				thirdArray[i] = secondArray[i];
			}
		}

		for (int i = 0; i < thirdArray.length; i++) {
			System.out.print(thirdArray[i] + " ");
		}
	}

	public static int validateLengthArray() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println("The number is negative or equal to 0! Please try again!\nEnter your number :");
			}
		} while (input < 1);
		return input;
	}
}
