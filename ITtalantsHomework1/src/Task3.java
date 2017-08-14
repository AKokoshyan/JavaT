import java.util.Scanner;

public class Task3 {
	/**
	 * To be made a program which is swapping the values of the variables!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers and program will change theri values!\nEnter first number : ");

		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();

		int swapNumbers = secondNumber;
		secondNumber = firstNumber;
		firstNumber = swapNumbers;

		System.out.println("Now first number is " + firstNumber + " and second is " + secondNumber + " !");

	}

}
