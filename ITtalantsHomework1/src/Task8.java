import java.util.Scanner;

public class Task8 {
	/**
	 * To be made a program which is reading 4 digit number from the range 1000
	 * to 9999 and make declare 2 variables 1 is initialized with first and
	 * fourth digit and second with second and third number and to compare the
	 * two variables!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a four digit number :");
		int inputNumber;

		do {
			inputNumber = scanner.nextInt();
			if (inputNumber < 1000 || inputNumber > 9999) {
				System.out.println(
						"The number that you had entered is not 4 digit number ! Please enter 4 digit number ! Try again !\nEnter your number :");
			}
		} while (inputNumber < 1000 || inputNumber > 9999);

		int fourthDigit = inputNumber % 10;
		int thirdDigit = (inputNumber / 10) % 10;
		int secondDigit = (inputNumber / 100) % 10;
		int firstDigit = inputNumber / 1000;

		int firstFourthDigits = (firstDigit * 10) + fourthDigit;
		int secondThirdDigits = (secondDigit * 10) + thirdDigit;

		if (firstFourthDigits < secondThirdDigits) {
			System.out.println("It's smaller (" + firstFourthDigits + "<" + secondThirdDigits + ")");
		} else if (firstFourthDigits == secondThirdDigits) {
			System.out.println("It's equal (" + firstFourthDigits + "=" + secondThirdDigits + ")");
		} else if (firstFourthDigits > secondThirdDigits) {
			System.out.println("It's bigger (" + firstFourthDigits + ">" + secondThirdDigits + ")");
		}
	}

}
