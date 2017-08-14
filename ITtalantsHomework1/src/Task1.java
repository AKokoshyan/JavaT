import java.util.Scanner;

public class Task1 {
	/**
	 * To be made a program which is reading tree numbers and to print massage
	 * is the third number between first and second or not !
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter tree numbers and program will check is the third number between the first and the second number !\nEnter first number : ");
		double firstNumber = scanner.nextDouble();

		System.out.println("Enter second number : ");
		double secondNumber = scanner.nextDouble();

		System.out.println("Enter third number : ");
		double thirdNumber = scanner.nextDouble();

		if ((thirdNumber > firstNumber && thirdNumber < secondNumber)
				|| (thirdNumber > secondNumber && thirdNumber < firstNumber)) {
			System.out.println(
					"The number " + thirdNumber + " is between " + firstNumber + " and " + secondNumber + " !");
		} else {
			System.out.println(
					"The number " + thirdNumber + " is not between " + firstNumber + " and " + secondNumber + " !");
		}
	}

}
