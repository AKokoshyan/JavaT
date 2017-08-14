import java.util.Scanner;

public class Task18 {
	/**
	 * To be made a program which is reading 2 numbers in range of 1 to 9 and to
	 * print the multiplication table ! Corner case : 1) To validate input!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter two numbers in range 1 to 9 and the program will print multiplication tabele for your numbers !\nEnter first number : ");
		int firstNumber = validateInput(scanner);

		System.out.println("Enter second number : ");
		int secondNumber = validateInput(scanner);

		for (int i = 1; i <= firstNumber; i++) {
			for (int j = 1; j <= secondNumber; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
	}

	public static int validateInput(Scanner scanner) {
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1 || input > 9) {
				System.out.println(
						"The number that you entered is out of range 1 to 9! Please try agian !\nEnter your number :");
			}
		} while (input < 1 || input > 9);
		return input;
	}
}
