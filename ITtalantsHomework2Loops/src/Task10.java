import java.util.Scanner;

public class Task10 {
	/**
	 * To be made a program which is reading one number from the console and
	 * check is it prime!
	 */

	public static void main(String[] args) {
		System.out.println("Enter postive number and the program will check is it prime !");
		int inputNumber = validateInput();
		boolean isPrime = true;

		if (inputNumber == 1 || inputNumber == 2) {
			isPrime = true;
		} else {
			for (int i = 2; i < inputNumber / 2; i++) {
				if (inputNumber % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		System.out.println("The number " + inputNumber + " is " + (isPrime ? "prime !" : "not prime !"));

	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);
		int inputNumber;

		do {
			inputNumber = scanner.nextInt();
			if (inputNumber < 1) {
				System.out.println(
						"The number that you entered is not positive! You have to eneter positive number ! Try again :");
			}
		} while (inputNumber < 1);
		return inputNumber;
	}
}
