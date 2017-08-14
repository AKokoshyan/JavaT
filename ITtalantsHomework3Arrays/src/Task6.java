import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive number for length of the first array : ");
		int lengthFirstArray = validateLengthArray();

		System.out.println("Enter a positive number for length of the second array : ");
		int lengthSecondArray = validateLengthArray();

		int[] firstArray = new int[lengthFirstArray];
		int[] secondArray = new int[lengthSecondArray];

		System.out.println("The program will check are the two arrays equal or not !\n");

		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Enter " + (i + 1) + " element of first array : ");
			firstArray[i] = scanner.nextInt();
		}

		for (int i = 0; i < secondArray.length; i++) {
			System.out.println("Enter " + (i + 1) + " element of second array : ");
			secondArray[i] = scanner.nextInt();
		}

		boolean isEqual = true;
		if (firstArray.length == secondArray.length) {
			for (int i = 0; i < secondArray.length; i++) {
				if (firstArray[i] != secondArray[i]) {
					isEqual = false;
					break;
				}
			}
		} else {
			isEqual = false;
		}

		System.out.println("The two arrays are " + (isEqual ? "equal !" : "not equal !"));

	}

	public static int validateLengthArray() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you entered is negative or equal to 0! Please try again !\nEnter number :");
			}
		} while (input < 1);
		return input;
	}
}
