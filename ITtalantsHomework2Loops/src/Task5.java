import java.util.Scanner;

public class Task5 {
	/**
	 * To be made a program which is reading 2 numbers from the console and is
	 * printing the row of the numbers in ascending order !
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter two numbers and the program will print the row of the numbers from smallest to biggest !\nEnter first number : ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number :");
		int secondNumber = scanner.nextInt();

		int smallestNumber = firstNumber;
		int biggestNumber = secondNumber;

		if (firstNumber > secondNumber) {
			biggestNumber = firstNumber;
			smallestNumber = secondNumber;
		}

		for (int i = smallestNumber; i <= biggestNumber; i++) {
			System.out.print(i + " ");
		}

	}

}
