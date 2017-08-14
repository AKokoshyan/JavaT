import java.util.Scanner;

public class Task12 {
	/**
	 * To be made a program which is reading tree numbers for day, month and
	 * year and to print next day!s
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Enter tree numbers for year, month and day and program will print which is the next day!\nEnter number for year : ");
		int inputYear = scanner.nextInt();

		boolean isLeapYear = isLeapYear(inputYear);

		System.out.println("Enter number for month : ");
		int inputMonth = validateMonth(scanner);

		System.out.println("Enter number for day : ");
		int inputDay = validateDay(scanner, isLeapYear, inputMonth);

		int nextDay;
		int nextMonth;
		int nextYear;

		if (inputMonth == 12 && inputDay == 31) {
			nextDay = 1;
			nextMonth = 1;
			nextYear = inputYear + 1;
		} else if (inputMonth == 2 && inputDay == 29) {
			nextDay = 1;
			nextMonth = inputMonth + 1;
			nextYear = inputYear;
		} else if (inputMonth == 2 && inputDay == 28) {
			nextDay = 1;
			nextMonth = inputMonth + 1;
			nextYear = inputYear;
		} else if (inputDay == 31 || inputDay == 30) {
			nextDay = 1;
			nextMonth = inputMonth + 1;
			nextYear = inputYear;
		} else {
			nextDay = inputDay + 1;
			nextMonth = inputMonth;
			nextYear = inputYear;
		}

		System.out.println(isLeapYear);
		// System.out.println("The next day is " + nextDay + "." + nextMonth +
		// "." + nextYear);
	}

	public static int validateDay(Scanner scanner, boolean isLeapYear, int month) {

		int inputDay = 0;
		if (isLeapYear) {
			if (month == 2) {
				do {
					inputDay = scanner.nextInt();
					if (inputDay < 1 || inputDay > 29) {
						System.out.println(
								"The day that you entered is out of range from 1 to 29! Please try again !\nEnter number for day : ");
					}
				} while (inputDay < 1 || inputDay > 29);
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				do {
					inputDay = scanner.nextInt();
					if (inputDay < 1 || inputDay > 31) {
						System.out.println(
								"The day that you entered is out of range from 1 to 31! Please try again !\nEnter number for day : ");
					}
				} while (inputDay < 1 || inputDay > 31);
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				do {
					inputDay = scanner.nextInt();
					if (inputDay < 1 || inputDay > 30) {
						System.out.println(
								"The day that you entered is out of range from 1 to 30! Please try again !\nEnter number for day : ");
					}
				} while (inputDay < 1 || inputDay > 30);
			}
		} else {
			if (month == 2) {
				do {
					inputDay = scanner.nextInt();
					if (inputDay < 1 || inputDay > 28) {
						System.out.println(
								"The day that you entered is out of range from 1 to 28! Please try again !\nEnter number for day : ");
					}
				} while (inputDay < 1 || inputDay > 28);
			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				do {
					inputDay = scanner.nextInt();
					if (inputDay < 1 || inputDay > 31) {
						System.out.println(
								"The day that you entered is out of range from 1 to 31! Please try again !\nEnter number for day : ");
					}
				} while (inputDay < 1 || inputDay > 31);
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				do {
					inputDay = scanner.nextInt();
					if (inputDay < 1 || inputDay > 30) {
						System.out.println(
								"The day that you entered is out of range from 1 to 30! Please try again !\nEnter number for day : ");
					}
				} while (inputDay < 1 || inputDay > 30);
			}
		}
		return inputDay;
	}

	public static int validateMonth(Scanner scanner) {

		int inputMonth;
		do {
			inputMonth = scanner.nextInt();
			if (inputMonth < 1 || inputMonth > 12) {
				System.out.println(
						"The number that you entered is not proper for months! The number must be from 1 to 12! Try again!\nEnter number for months : ");
			}
		} while (inputMonth < 1 || inputMonth > 12);
		return inputMonth;
	}

	public static boolean isLeapYear(int inputYear) {
		boolean isLeapYear = false;
		if (inputYear % 4 == 0 && (inputYear % 100 != 0 || inputYear % 400 == 0)) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		return isLeapYear;
	}
}
