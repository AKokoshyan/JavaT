import java.util.Scanner;

public class Task8 {
	/**
	 * To be made a program which read a number of 3 digits and print it in
	 * reverse! 123 = 321
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number of 3 digit and the program will print it in reverse !\nEnter a number : ");
		int input = scanner.nextInt();

		int firstDigit = input % 10;
		int secondDigit = (input / 10) % 10;
		int thirdDigit = input / 100;

		System.out.println("Your number in reverse is : \n" + (firstDigit * 100 + secondDigit * 10 + thirdDigit));
	}

}
