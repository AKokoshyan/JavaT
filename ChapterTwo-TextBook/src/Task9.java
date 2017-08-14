import java.util.Scanner;

public class Task9 {
	/**
	 * To be made a program which read two numbers and swap their values!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers and program will swap their values!\nEnter value for X : ");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter value for Y : ");
		int secondNumber = scanner.nextInt();

		int reminder = firstNumber;
		firstNumber = secondNumber;
		secondNumber = reminder;

		System.out.println("Now X is : " + firstNumber + "\nNow Y is : " + secondNumber);
	}

}
