import java.util.Scanner;

public class Task15 {
	/**
	 * To be made a program which is reading from console real number from 1 to
	 * 24 and depends of the number to print greeting massage!
	 */

	public static void main(String[] args) {
		System.out.println("Enter a number for hour and the program will print greeting massage !\nEnter hour :");
		int inputHour = validateHour();

		if (inputHour >= 4 && inputHour < 9) {
			System.out.println("Good morning!");
		} else if (inputHour >= 9 && inputHour < 18) {
			System.out.println("Good day !");
		} else {
			System.out.println("Good evening !");
		}
	}

	public static int validateHour() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1 || input > 24) {
				System.out.println(
						"The number that you entered is not a proper hour! Number must be from 1 to 24! Try again!\nEnter hour :");
			}
		} while (input < 1 || input > 24);
		return input;
	}

}
