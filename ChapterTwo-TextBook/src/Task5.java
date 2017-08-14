import java.util.Scanner;

public abstract class Task5 {
	/**
	 * To be made a program which is reading a number from console and print
	 * true if the number can be divided by module 7!
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a number and the program will check can this number be divided by module 7 !\nEnter your number : ");
		int inputNumber = scanner.nextInt();

		boolean isDivisible = inputNumber % 7 == 0;

		System.out.println(isDivisible);
	}

}
