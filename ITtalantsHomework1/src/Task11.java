import java.util.Scanner;

public class Task11 {
	/**
	 * To be made a program which read one number and check is divisible of
	 * every digit!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a tree digit number and the program will check is it divisible of every digit ot it !\nEnter your number : ");

		int inputNumber, fourthDigit, secondDigit, firstDigit;

		do {
			inputNumber = scanner.nextInt();
			fourthDigit = inputNumber % 10;
			secondDigit = (inputNumber / 10) % 10;
			firstDigit = inputNumber / 100;
			if (fourthDigit == 0 || secondDigit == 0 || firstDigit == 0) {
				System.out.println(
						"The number that you had entered contains 0! You have to enter number which is not containing 0 !Try again!\n\nEnter your number again : ");
			}

		} while (fourthDigit == 0 || secondDigit == 0 || firstDigit == 0);

		if (inputNumber % fourthDigit == 0 && inputNumber % secondDigit == 0 && inputNumber % firstDigit == 0) {
			System.out.println("Yes, the number that you had entered is dividialbe of all it's digits ! ");
		} else {
			System.out.println("No, the number that you had entered is not dividialbe of all it's digits ! ");
		}

	}

}
