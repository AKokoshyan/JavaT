import java.util.Scanner;

public class Task14 {
	/**
	 * To be made a program which is reading a number in range 10 to 200 and
	 * print in descending order the numbers which are divisible by 7!
	 * 
	 * To validate input number! Corner case: if input number is equal to 200
	 * and between 200 and 196 there are no number divisible by 7 - to print
	 * proper message!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a number in range of 10 to 200 and program will print all natural numbers which are divisible by 7 !\nEnter your number :");
		int inputNumber = validateInput(scanner);

		if (inputNumber == 200) {
			System.out.println("There are no natural numbers between 200 and 200 !");
		} else if (inputNumber > 196) {
			System.out.println("In range " + inputNumber + " and 200 there are no numbers divisible by 7 !");
		} else {
			System.out.print("The numbers in range 200 and " + inputNumber + " which are divisible by 7 are : ");
			for (int i = 200; i >= inputNumber; i--) {
				if (i % 7 == 0) {
					System.out.print(i + " ");
				}
			}
		}

	}

	public static int validateInput(Scanner scanner) {
		int input;
		do {
			input = scanner.nextInt();
			if (input < 10 || input > 200) {
				System.out.println(
						"The number which you entered is out of range from 10 to 200! Enter number in range from 10 to 200 ! Try again !\nEnter your number : ");
			}
		} while (input < 10 || input > 200);
		return input;
	}
}
