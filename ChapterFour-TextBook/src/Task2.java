import java.util.Scanner;

public class Task2 {
	/**
	 * To be made a program which is reading tree numbers from the console and
	 * print yes if the second number is between first and third one else to
	 * print no
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(
				"Enter tree numbers and the program will check is the second number between the first and third number!\nEnter first number :");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();

		System.out.println("Enter third number : ");
		int thirdNumber = scanner.nextInt();

		if (secondNumber > firstNumber && secondNumber < thirdNumber) {
			System.out.println("Yes, second number is between the first and third number !");
		} else {
			System.out.println("No, second number is not between the first and third number !");
		}
	}

}
