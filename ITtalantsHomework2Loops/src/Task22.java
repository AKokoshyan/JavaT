import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a number in range 1 to 999 and program will print all 10 small numbers after your number!\nEnter your number :");
		int inputNumber = validateInput(scanner);

		int indexNumber = 1;

		while (indexNumber <= 10) {
			inputNumber++;
			if (inputNumber % 2 == 0 || inputNumber % 3 == 0 || inputNumber % 5 == 0) {
				if (indexNumber == 10) {
					System.out.print(indexNumber + ":" + inputNumber);
				} else {
					System.out.print(indexNumber + ":" + inputNumber + "; ");
				}
				++indexNumber;
			}
		}

	}

	public static int validateInput(Scanner scanner) {
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1 || input > 999) {
				System.out.println(
						"The number that you entered is out of range of 1 to 999! Please try again!\nEnter your number :");
			}
		} while (input < 1 || input > 999);
		return input;
	}

}
