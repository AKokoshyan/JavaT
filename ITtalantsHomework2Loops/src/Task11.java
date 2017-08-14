import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number greater than 3 and program will print a triangle!\nEnter your number : ");
		int inputNumber = validateInput(scanner);

		int spaces = inputNumber - 1;

		for (int i = 0; i < inputNumber; i++) {
			if (i == inputNumber - 2) {
				continue;
			} else if (i == inputNumber - 1) {
				for (int j = 0; j < 2 * i + 1; j++) {
					System.out.print(".");
				}
				break;
			}

			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			System.out.println();
			spaces--;
		}

	}

	public static int validateInput(Scanner scanner) {
		int input;
		do {
			input = scanner.nextInt();
			if (input < 3) {
				System.out.println(
						"The number that you entered is not enough to build a triangle! Enter number greater than 3! Please try again !\nEnter your number : ");
			}
		} while (input < 3);
		return input;
	}
}
