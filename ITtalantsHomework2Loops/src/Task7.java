import java.util.Scanner;

public class Task7 {
	/**
	 * To be made a program which is reading a number from the console and print
	 * all numbers from 3 to
	 */

	public static void main(String[] args) {
		System.out.println("Enter a positive number and not equal to 0 : ");

		int inputNumber = validateInput();

		int loopLentgh = inputNumber * 3;

		System.out.println("The program will print first " + inputNumber + " numbers which are dividable by 3 !");
		for (int i = 3; i <= loopLentgh; i++) {
			if (i != loopLentgh) {
				if (i % 3 == 0) {
					System.out.print(i + ", ");
				}
			} else {
				if (i % 3 == 0) {
					System.out.print(i);
				}
			}
		}

	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"You have to enter positive number or greater than 0 ! Please try again!\nEnter your number : ");
			}
		} while (input < 1);
		return input;
	}
}
