import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		String first = readString();
		String second = readString();
		compareTwoStrings(first, second);
	}

	static String readString() {
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.println("Enter your string : ");
		do {
			input = scanner.nextLine();
		} while (validateInput(input));
		return input;
	}

	static boolean validateInput(String input) {
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				return true;
			}
		}
		return false;
	}

	static void compareTwoStrings(String first, String second) {
		if (first.length() != second.length()) {
			System.out.println("The length of two strings is not equal !");
		} else {
			System.out.println("The two strings are with same length!\nThe diffrence in position : ");
			for (int i = 0; i < first.length(); i++) {
				if (first.charAt(i) != second.charAt(i)) {
					System.out.println((i + 1) + " " + first.charAt(i) + " - " + second.charAt(i));
				}
			}
		}
	}
}
