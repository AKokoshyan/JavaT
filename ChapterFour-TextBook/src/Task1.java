import java.util.Scanner;

public class Task1 {
	/**
	 * To be made a program which is reading 3 numbers from the console and
	 * print the bigest one!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter tree numbers and program will print the bigest number !\nEnter first number : ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();

		System.out.println("Enter third number : ");
		int thirdNumber = scanner.nextInt();

		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber + " is the bigest number !");
		} else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
			System.out.println(secondNumber + " is the bigest number !");
		} else {
			System.out.println(thirdNumber + " is the bigest number !");
		}
	}

}
