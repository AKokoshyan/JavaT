import java.util.Scanner;

public class Task6 {
	/**
	 * To be made a program which is reading 2 numbers and make the sum,
	 * subtraction, multiplication and division of them !
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value for x :");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter value for y :");
		int secondNumber = scanner.nextInt();

		System.out.println("x + y = " + (firstNumber + secondNumber));
		System.out.println("x - y = " + (firstNumber - secondNumber));
		System.out.println("x * y = " + (firstNumber * secondNumber));
		System.out.println("x / y = " + (firstNumber / secondNumber));
		System.out.println("x % y = " + (firstNumber % secondNumber));
	}

}
