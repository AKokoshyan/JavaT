import java.util.Scanner;

public class Task12 {
	/**
	 * To be made a program which is reading two numbers from console and swap
	 * their values without extra variable!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value for X : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter value for Y : ");
		int secondNumber = scanner.nextInt();

		firstNumber = secondNumber + firstNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;

		System.out.println("Now X is : " + firstNumber + "\nNow Y is : " + secondNumber);
	}

}
