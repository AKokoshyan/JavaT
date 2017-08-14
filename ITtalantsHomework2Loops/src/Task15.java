import java.util.Scanner;

public class Task15 {
	/**
	 * To be made a program which is reading a number from console and make the
	 * sum from 1 to input number! Corner case:input number is negative or equal
	 * to 1!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number and the program will print the sum of numbers from 1 to your number");
		int inputNumber = scanner.nextInt();

		int maxNumber = inputNumber;
		int minNumber = 1;
		int sum = 0;

		if (maxNumber < minNumber) {
			maxNumber = minNumber;
			minNumber = inputNumber;
		}

		if (minNumber == maxNumber) {
			sum = 1;
		} else {
			do {
				sum += minNumber;
				minNumber++;
			} while (minNumber <= maxNumber);
		}

		System.out.println("The sum of numbers from 1 to " + inputNumber + " is : " + sum);
	}

}
