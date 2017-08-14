import java.util.Scanner;

public class Task8 {
	/**
	 * To be made a program which is reading 4 numbers from the console for
	 * coordinates for chess table and to print are the given coordinate with
	 * same color!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first coordinate for first field : ");
		int firstNumberFirstCoor = validateInput();

		System.out.println("Enter second coordinate for first field :");
		int secondNumberFirstCoor = validateInput();

		System.out.println("Enter first coordinate for second field : ");
		int firstNumberSecCoor = validateInput();

		System.out.println("Enter second coordinate for second field : ");
		int secondNumberSecCoor = validateInput();

		boolean isFirstFieldBlack;
		boolean isSecondFieldBlack;

		if ((firstNumberFirstCoor % 2 != 0 && secondNumberFirstCoor % 2 != 0)
				|| (firstNumberFirstCoor % 2 == 0 && secondNumberFirstCoor % 2 == 0)) {
			isFirstFieldBlack = true;
		} else {
			isFirstFieldBlack = false;
		}

		if ((firstNumberSecCoor % 2 != 0 && secondNumberSecCoor % 2 != 0)
				|| (firstNumberSecCoor % 2 == 0 && secondNumberSecCoor % 2 == 0)) {
			isSecondFieldBlack = true;
		} else {
			isSecondFieldBlack = false;
		}

		if (isFirstFieldBlack == isSecondFieldBlack) {
			System.out.println("Two fields [" + firstNumberFirstCoor + "," + secondNumberFirstCoor + "] and ["
					+ firstNumberSecCoor + "," + secondNumberSecCoor + "] are with the same color ! ");
		} else {
			System.out.println("Two fields [" + firstNumberFirstCoor + "," + secondNumberFirstCoor + "] and ["
					+ firstNumberSecCoor + "," + secondNumberSecCoor + "] are with diffrent color ! ");
		}
	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);

		int input = 0;

		do {
			input = scanner.nextInt();
			if (input < 1 || input > 8) {
				System.out.println(
						"Number which you had entered is out of the range from 1 to 8! Enter number from 1 to 8! Try again!\nEnter your number : ");
			}
		} while (input < 1 || input > 8);

		return input;
	}

}
