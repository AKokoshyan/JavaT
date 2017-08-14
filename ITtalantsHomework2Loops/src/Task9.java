import java.util.Scanner;

public class Task9 {
	/**
	 * Check condition from ITtalants Lesson 3 Homework - Loops.pdf
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		System.out.println("Enter first number : ");
		int firstNumber = scanner.nextInt();

		System.out.println("Enter second number : ");
		int secondNumber = scanner.nextInt();

		if (firstNumber == secondNumber) {
			System.out.println("There are no numbers between " + firstNumber + " and " + secondNumber + " !");
		} else {
			if (firstNumber < secondNumber) {
				for (int i = firstNumber; i < secondNumber; i++) {
					if (i % 3 == 0) {
						if (i == secondNumber - 1) {
							System.out.print("skip 3 ");
							continue;
						} else {
							System.out.print("skip 3, ");
							continue;
						}
					} else {
						if (i != secondNumber - 1) {
							System.out.print(i * i + ", ");
							sum += i * i;
						} else if (i == secondNumber - 1) {
							System.out.print(i * i);
							sum += i * i;
						}
					}
					if (sum > 200) {
						break;
					}
				}
			} else {
				for (int i = firstNumber; i > secondNumber; i--) {
					if (i % 3 == 0) {
						if (i == secondNumber + 1) {
							System.out.print("skip 3 ");
							continue;
						} else {
							System.out.print("skip 3, ");
							continue;
						}
					} else {
						if (i != secondNumber + 1) {
							System.out.print(i * i + ", ");
							sum += i * i;
						} else if (i == secondNumber + 1) {
							System.out.print(i * i);
							sum += i * i;
						}
					}
					if (sum > 200) {
						break;
					}
				}

			}
		}

	}

}
