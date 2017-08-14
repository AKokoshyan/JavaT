import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		getFiveConsecutivesHeads();
	}

	static String readInput() {
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			input = scanner.nextLine();
		} while (validateInput(input));

		return input;
	}

	static boolean validateInput(String input) {
		if (input.equals("heads") || input.equals("tails")) {
			return false;
		} else {
			System.out.println("The string that you entered is not equal to heads or tails ! Try again! ");
			return true;
		}
	}

	static void getFiveConsecutivesHeads() {
		int totalIteration = 0;
		int counterHeads = 0;
		String current;

		while (counterHeads < 5) {
			System.out.println("heads or tails ?");
			current = readInput();

			if (current.equals("heads")) {
				counterHeads++;
			} else {
				counterHeads = 0;
			}
			totalIteration++;
		}

		System.out.println("The total iterations to get 5 consecutives heads are : " + totalIteration);
	}

}
