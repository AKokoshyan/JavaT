import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		String first = readString();
		String second = readString();

		System.out.println(isFirstStringPrefix(first, second) ? "true" : "false");

	}

	static String readString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string build only from alphabet chareckters : ");
		String input;
		do {
			input = scanner.nextLine();
		} while (validateInput(input));
		return input;
	}

	static boolean validateInput(String input) {
		boolean isNotAlphabetic = false;
		for (int i = 0; i < input.length(); i++) {
			if ((input.charAt(i) < 'a' || input.charAt(i) > 'z') && (input.charAt(i) < 'A' || input.charAt(i) > 'Z')) {
				isNotAlphabetic = true;
				System.out.println(
						"The string that you entered is containing other charecters diffrent from alphabet ! Try again !");
				break;
			}
		}

		return isNotAlphabetic;
	}

	static boolean isFirstStringPrefix(String first, String second) {
		boolean isPrefix = true;
		if (first.length() > second.length()) {
			isPrefix = false;
		} else {
			for (int i = 0; i < first.length(); i++) {
				if (first.charAt(i) != second.charAt(i)) {
					isPrefix = false;
					break;
				}
			}
		}
		return isPrefix;
	}
}
