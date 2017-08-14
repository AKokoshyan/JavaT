import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		String input = "maika ti typa";
		getResult(input);
	}

	static String readString() {
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			input = scanner.nextLine();
		} while (validateInput(input));
		return input;
	}

	static boolean validateInput(String input) {
		boolean thereIsSpace = false;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				thereIsSpace = true;
			}
		}

		if (thereIsSpace) {
			return false;
		} else {
			return true;
		}
	}

	static void getResult(String input) {
		String[] names = input.split(" ");

		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].substring(0, 1).toUpperCase() + names[i].substring(1).toLowerCase();
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
