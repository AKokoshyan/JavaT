import java.util.Scanner;

public class Task19 {
	/**
	 * To be made a program which is reading a number in range 10 to 99 and
	 * print sequence of number if the number is even to be multiplied by 0.5 if
	 * its odd to be multiplied by 3 +1 if it's 1 to print 1 and to stop!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int inputNumber = validateInput(scanner);
		int repeater = inputNumber;

		while (repeater != 1) {
			if (repeater % 2 == 0) {
				repeater *= 0.5;
				System.out.print(repeater + " ");
			} else {
				if (repeater == 1) {
					System.out.print(repeater);
					break;
				}

				repeater = (3 * repeater) + 1;
				System.out.print(repeater + " ");
			}
		}

	}

	public static int validateInput(Scanner scanner) {
		int input;
		do {
			input = scanner.nextInt();
			if (input < 10 || input > 99) {
				System.out.println(
						"The number that you entered is out of range 10 to 99! Please try again!\nEnter your number : ");
			}
		} while (input < 10 || input > 99);
		return input;
	}
}
