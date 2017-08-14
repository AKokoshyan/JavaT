import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		int inputRepeater = input;
		int multiplier = 1;
		int inputCopyTest = input;

		while (inputRepeater > 10) {
			inputRepeater /= 10;
			multiplier *= 10;
		}

		int reversNumber = 0;
		int currentDigit;

		do {
			currentDigit = (input % 10);
			reversNumber += currentDigit * multiplier;
			multiplier /= 10;
			input /= 10;
		} while (input > 0);

		System.out.println(inputCopyTest == reversNumber ? "Is palindrom !" : "Is not palindrom !" );
	}

}
