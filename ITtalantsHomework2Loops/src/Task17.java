import java.util.Scanner;

public class Task17 {
	/**
	 * To be made a program which is reading a number in range of 3 to 20 and
	 * symbol and to print square with length of the side equal to the input
	 * number! The square side to be formed by * and the square inside to be
	 * filled with the symbol!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a number from 3 to 20 and program will print square bounded by * and inside will be with the symbol which you will enter !\nEnter your number : ");
		int input = validateInput(scanner);

		System.out.println("Enter a symbol : ");
		char symbol = scanner.next().charAt(0);

		for (int rows = 0; rows < input; rows++) {
			if (rows == 0 || rows == input - 1) {
				for (int i = 0; i < input; i++) {
					System.out.print("*");
				}
			} else {
				System.out.print("*");
				for (int i = 0; i < input - 2; i++) {
					System.out.print(symbol);
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static int validateInput(Scanner scanner) {
		int input;

		do {
			input = scanner.nextInt();
			if (input < 3 || input > 20) {
				System.out.println(
						"The number you have entered is out of range 3 to 20! Try again !\nEnter your number : ");
			}
		} while (input < 3 || input > 20);
		return input;
	}
}
