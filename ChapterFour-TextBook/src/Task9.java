import java.util.Scanner;

public class Task9 {
	/**
	 * To be made a program which is reading 4 digit number from console and
	 * check is one of the digit equal to 0!
	 */

	public static void main(String[] args) {
		System.out
				.println("Enter 4 digit number and the program will check is it containing 0 !\nEnter your number : ");

		int inputNumber = validateInput();

		int firstDigit = inputNumber % 10;
		int secondDigit = (inputNumber / 10) % 10;
		int thirdDigit = (inputNumber / 100) % 10;
		int fourthDigit = inputNumber / 1000;

		if (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0 || fourthDigit == 0) {
			System.out.println("The number that you had entered is containing 0 !");
		} else {
			System.out.println("The number that you had entered is not containing 0 !");
		}
	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);

		int input = 0;

		do {
			input = scanner.nextInt();
			if (input < 1000 || input > 9999) {
				System.out.println(
						"Number which you had entered is not 4 digit number ! Enter 4 digit number ! Try again!\nEnter your number : ");
			}
		} while (input < 1000 || input > 9999);

		return input;
	}

}
