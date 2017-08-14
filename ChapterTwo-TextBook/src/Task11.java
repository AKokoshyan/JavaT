import java.util.Scanner;

public class Task11 {
	/**
	 * To be made a program which is reading 4 digit number and print every
	 * number on new line!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out
				.println("Enter a 4 digit number and program will print each digit ot new line!\nEnter your number : ");
		int inputNumber = scanner.nextInt();

		int firstNumber = inputNumber % 10;
		int secondNumber = (inputNumber / 10) % 10;
		int thirdNumber = (inputNumber / 100) % 10;
		int fourthNumber = inputNumber / 1000;

		System.out.println("Digit of tousands " + fourthNumber + "\nDigit of hundreds " + thirdNumber
				+ "\nDigit of dozens " + secondNumber + "\nDigit of units " + firstNumber);
	}

}
