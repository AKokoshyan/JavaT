import java.util.Scanner;

public class Task6 {
	/**
	 * To be made a program which read 3 numbers and swap their places a1 = a2
	 * a2 = a3 a3 = a1
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter tree number and the program will swip their places !\nA1 = A2 ; A2 = A3 ; A3 = A1\nEnter A1 : ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter A2 : ");
		int secondNumber = scanner.nextInt();

		System.out.println("Enter A3 : ");
		int thirdNumber = scanner.nextInt();

		int reminder = firstNumber;
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
		thirdNumber = reminder;

		System.out.println("Now A1 is " + firstNumber + "\nNow A2 is " + secondNumber + "\nNow A3 is " + thirdNumber);
	}

}
