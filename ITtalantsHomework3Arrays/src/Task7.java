import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive number for length of an array : ");
		int lengthArray = validateLnegthArray();

		int[] array = new int[lengthArray];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextInt();
		}

		int[] secondArray = new int[lengthArray];

		for (int i = 0; i < secondArray.length; i++) {
			if (i == 0 || i == secondArray.length - 1) {
				secondArray[i] = array[i];
			} else {
				secondArray[i] = array[i - 1] + array[i];
			}
		}

		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}

	}

	public static int validateLnegthArray() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you entered is negative or equal to 0! Please try again!\nEnter your number :");
			}
		} while (input < 1);
		return input;
	}

}
