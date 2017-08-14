import java.util.Scanner;

public class Task10 {
	/**
	 * To be made a program which read two boolean numbers from console and
	 * print the result from "&","|" and "^"!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter two boolean numbers and the program will make operation of logical and , logical or and exluded or!\nEnter value for x : ");
		boolean firstNumber = scanner.nextBoolean();
		System.out.println("Enter value for y :");
		boolean secondNumber = scanner.nextBoolean();

		System.out.println("x & y = " + (firstNumber && secondNumber));
		System.out.println("x | y = " + (firstNumber || secondNumber));
		System.out.println("x ^ y = " + (firstNumber ^ secondNumber));
	}

}
