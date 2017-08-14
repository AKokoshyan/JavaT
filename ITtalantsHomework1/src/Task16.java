import java.util.Scanner;

public class Task16 {
	/**
	 * To be made a program which is reading tree digit number and check the
	 * conditions as per textbook page 225 task 4!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a tree digit number and program will check : \nAre all digit equal !\nAre all digits in ascending order !\nAre all digits in descending order !");

		int inputNumber;

		do {
			inputNumber = scanner.nextInt();

			if (inputNumber < 100 || inputNumber > 999) {
				System.out.println(
						"The number that you had entered is not from 3 digits! Try again!\nEnter your number : ");

			}

		} while (inputNumber < 100 || inputNumber > 999);

		int firstNumber = inputNumber % 10;
		int secondNumber = (inputNumber / 10) % 10;
		int thirdNumber = inputNumber / 100;

		if (firstNumber == secondNumber && secondNumber == thirdNumber) {
			System.out.println("All digits are equal !");
		} else if (firstNumber > secondNumber && secondNumber > thirdNumber) {
			System.out.println("All digits are in ascending order !");
		} else if (firstNumber < secondNumber && secondNumber < thirdNumber) {
			System.out.println("All digits are in descending order !");
		} else {
			System.out.println("The digits of the number are not equal or oredered ascending or descending ! ");
		}

	}

}
