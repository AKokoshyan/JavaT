import java.util.Scanner;

public class Task16 {
	/**
	 * To be made a program which is reading 2 numbers in range 10 to 5555 and
	 * to print the numbers in range first Number and second Number which are
	 * divisible by 50!
	 */
	// Corner case :
	// 1) Validate input number from 10 to 5555!
	// 2) First number is equal to second number !
	// 3) First number is smaller then second number!
	// 4) In range first number to second number there is no number divisible by
	// 50!

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter two number in range 10 to 5555 and program will print the numbers which are divisible by 50 in range which you set by your two numbers!\nEnter first number : ");
		int firstNumber = validateInput(scanner);

		System.out.println("Enter second number : ");
		int secondNumber = validateInput(scanner);

		int maxNumber = secondNumber;
		int minNumber = firstNumber;
		int counter = 0;

		if (firstNumber == secondNumber) {
			System.out.println("There are no natural numbers between " + firstNumber + " and " + secondNumber);
			counter++;
		} else {
			if (maxNumber < minNumber) {
				maxNumber = firstNumber;
				minNumber = secondNumber;
			}
			counter = 0;
			for (int i = maxNumber; i >= minNumber; i--) {
				if (i % 50 == 0) {
					counter++;
					System.out.print(i + " ");
				}

			}
		}
		if (counter == 0) {
			System.out.println(
					"In the range " + minNumber + " and " + maxNumber + " there are no numbers divisible by 50 !");
		}

	}

	public static int validateInput(Scanner scanner) {
		int input;
		do {
			input = scanner.nextInt();
			if (input < 10 || input > 5555) {
				System.out.println(
						"The number that you entered is out of range 10 to 5555! Pleas try again !\nEnter your nuber :");
			}
		} while (input < 10 || input > 5555);
		return input;
	}
}
