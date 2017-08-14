import java.util.Scanner;

public class Task13 {
	/**
	 * To be made a program which is reading number from 2 to 27 and to print
	 * all 3 digit natural number which sum of its digit are equal to input
	 * number !
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a number in range of 2 to 27 and program will print all 3 digit natural numbers which its sum of digits are equal to your number !\nEnter your number :  ");
		int inputNumer = validateInput(scanner);

		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int sum = 0;

		System.out.print("All tree digit natural numbers which are equal to " + inputNumer + " are : ");

		for (int i = 100; i <= 999; i++) {
			firstDigit = i % 10;
			secondDigit = (i / 10) % 10;
			thirdDigit = i / 100;

			sum = firstDigit + secondDigit + thirdDigit;

			if (inputNumer == sum) {
				System.out.print(i + " ");
			}
		}

	}

	public static int validateInput(Scanner scanner) {
		int inputNumber;
		do {
			inputNumber = scanner.nextInt();
			if (inputNumber < 2 || inputNumber > 27) {
				System.out.println(
						"The number that you entered is out of range of 2 to 27 ! Enter number from 2 to 27 ! Try again!\nEnter your number : ");
			}
		} while (inputNumber < 2 || inputNumber > 27);
		return inputNumber;
	}
}
