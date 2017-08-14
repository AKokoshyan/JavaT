import java.util.Scanner;

public class Task13 {
	/**
	 * To be made a program which is reading a temperature in celsius and print
	 * appropriate message!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the temperature in celsius : ");

		int temperature = scanner.nextInt();

		if (temperature < -20) {
			System.out.println("It's very cold!");

		} else if (temperature >= -20 && temperature < 0) {
			System.out.println("It's cold!");
		} else if (temperature >= 0 && temperature < 15) {
			System.out.println("It's coldly!");
		} else if (temperature >= 15 && temperature < 25) {
			System.out.println("It's hot !");
		} else {
			System.out.println("It's very hot!");
		}

	}
}
