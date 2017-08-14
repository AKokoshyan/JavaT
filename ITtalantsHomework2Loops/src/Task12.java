import java.util.Scanner;

public class Task12 {
	/**
	 * To be made a program which is printing all 3 digit numbers which don't
	 * have equal digits!
	 */

	public static void main(String[] args) {
		int firstDigit;
		int secondDigit;
		int thirdDigit;

		for (int i = 100; i < 999; i++) {
			firstDigit = i % 10;
			secondDigit = (i / 10) % 10;
			thirdDigit = i / 100;

			if (firstDigit != secondDigit && firstDigit != thirdDigit && secondDigit != thirdDigit) {
				System.out.print(i + " ");
			}
		}
	}

}
