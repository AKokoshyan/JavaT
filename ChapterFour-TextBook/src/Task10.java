import java.util.Scanner;

public class Task10 {
	/**
	 * To be made a program which is reading tree numbers day, month and year
	 * and to print how many days are passed from the year's beginning!
	 */

	public static void main(String[] args) {

		int inputYear = validateYear();
		int inputMonth = validateMonth();
		int inputDay = validateDay();

		System.out.println(inputDay);
	}

	public static int validateYear() {
		Scanner scanner = new Scanner(System.in);

		int input;

		System.out.println("Enter a number for years :");

		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you had entered is invalid for days! You have to enter a number from 1 to 31 ! Try again !\nEnter number for days :");
			}
		} while (input < 1);

		return input;
	}

	public static int validateMonth() {
		Scanner scanner = new Scanner(System.in);

		int input;

		System.out.println("Enter a number for year :");

		do {
			input = scanner.nextInt();
			if (input < 1 || input > 12) {
				System.out.println(
						"The number that you had entered is invalid for months! You have to enter a number from 1 to 12 ! Try again !\nEnter number for months :");
			}
		} while (input < 1 || input > 12);

		return input;
	}

	public static int validateDay() {
		Scanner scanner = new Scanner(System.in);

		int input;

		System.out.println("Enter a number for years :");

		do {
			input = scanner.nextInt();
			if (input < 1 || input > 12) {
				System.out.println(
						"The number that you had entered is invalid for days! You have to enter a number from 1 to 31 ! Try again !\nEnter number for days :");
			}
		} while (input < 1 || input > 31);

		return input;
	}

	// public static int getDaysFromBegining(int year, int month,int day){
	// }
}
