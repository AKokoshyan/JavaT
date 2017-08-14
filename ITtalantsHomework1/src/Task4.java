import java.util.Scanner;

public class Task4 {
	/**
	 * To be made a program which is reading two numbers and print them in
	 * ascending order!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers and program will print them in ascending order !\nEnter first number : ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();

		if (firstNumber > secondNumber) {
			System.out.println(secondNumber + " " + firstNumber);
		} else {
			System.out.println(firstNumber + " " + secondNumber);
		}

	}

}
