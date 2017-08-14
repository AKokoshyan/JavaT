import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive number for length of an array !");
		int lengthArray = validateArrayLength();

		int[] array = new int[lengthArray];

		System.out
				.println("Initialize the elements of the array and the program will check is it mirror image or not !");

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextInt();
		}

		int iterateBackward = 1;
		boolean isMirrord = true;

		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - iterateBackward]) {
				isMirrord = false;
				break;
			}
			iterateBackward++;
		}

		System.out.println("The array is " + (isMirrord ? "mirror image !" : "not mirror image !"));
	}

	public static int validateArrayLength() {
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
