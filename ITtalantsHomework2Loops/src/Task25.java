import java.util.Scanner;

public class Task25 {
	/**
	 * To be made a program which is reading and number and print its factorial!
	 * Number must be positive !
	 */

	public static void main(String[] args) {

		System.out.println("Enter positive number and the program will return it's factorial !\nEnter your number : ");
		int inputNumber = validateInput();

		int factorial = 1;
		int inputNumberForResult = inputNumber;

		do {
			factorial *= inputNumber;
			inputNumber--;
		} while (inputNumber > 0);

		System.out.println("The factorial of " + inputNumberForResult + " is " + factorial + " !");

	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);

		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you enter is negative or equal to 0! Please try again!\nEnter your number : ");
			}
		} while (input < 1);
		return input;
	}
}
