import java.util.Scanner;

public class Task4 {
	/**
	 * To be made a program which read one number and check is divisible of
	 * every digit!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(
				"Enter a tree digit number and the program will check is it divisible of every digit ot it !\nEnter your number : ");

		int inputNumber, firstDigit, secondDigit, thirdDigit;

		do {
			inputNumber = scanner.nextInt();
			firstDigit = inputNumber % 10;
			secondDigit = (inputNumber / 10) % 10;
			thirdDigit = inputNumber / 100;
			if (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0) {
				System.out.println(
						"The number that you had entered contains 0! You have to enter number which is not containing 0 !Try again!\n\nEnter your number again : ");
			}

		} while (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0);

		if (inputNumber % firstDigit == 0 && inputNumber % secondDigit == 0 && inputNumber % thirdDigit == 0) {
			System.out.println("Yes, the number that you had entered is dividialbe of all it's digits ! ");
		} else {
			System.out.println("No, the number that you had entered is not dividialbe of all it's digits ! ");
		}

	}

}
