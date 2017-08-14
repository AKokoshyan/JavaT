import java.util.Scanner;

public class Task9 {
	/**
	 * To be made a program which is reading two numbers in range of [10-99] and
	 * to check is the last digit of multiplication of two input numbers is odd
	 * or even !
	 */

	public static void main(String[] args) {

		System.out.println(
				"Enter two numbers in range 10 to 99 and the program will print is the last digit of multiplication of your numbers is odd or even!\nEnter first number :");
		int firstInput = validateInput();

		System.out.println("Enter second number : ");
		int secondInput = validateInput();

		int multiplication = firstInput * secondInput;
		int fourthDigit = multiplication % 10;

		if (fourthDigit % 2 != 0) {
			System.out.println(multiplication + ", " + fourthDigit + " is odd !");
		} else {
			System.out.println(multiplication + ", " + fourthDigit + " is even !");
		}

	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);

		int input;
		do {
			input = scanner.nextInt();
			if (input < 10 || input > 99) {
				System.out.println(
						"The number that you had enter is out of range of 10 to 99! Please try again !\nEnter your number : ");
			}
		} while (input < 10 || input > 99);
		return input;
	}

}
