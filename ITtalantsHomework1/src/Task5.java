import java.util.Scanner;

public class Task5 {
	/**
	 * To be made a program which is reading tree numbers from the console and
	 * print them in descending order !
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter tree numbers and program will pritn the numbers in descending order !\nEnter first number : ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();

		System.out.println("Enter third number : ");
		int thirdNumber = scanner.nextInt();

		if (firstNumber > secondNumber && secondNumber > thirdNumber) {
			System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
		} else if (firstNumber > secondNumber && thirdNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber && thirdNumber > firstNumber) {
			System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber && firstNumber > thirdNumber) {
			System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
		} else if (thirdNumber > secondNumber && thirdNumber > firstNumber && secondNumber > firstNumber) {
			System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
		} else if (thirdNumber > secondNumber && thirdNumber > firstNumber && firstNumber > secondNumber) {
			System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
		}
	}

}
