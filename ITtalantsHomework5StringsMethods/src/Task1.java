import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		String first = readString();
		String second = readString();
		System.out.println(toUpperCase(first));
		System.out.println(toLowerCase(first));
		System.out.println(toUpperCase(second));
		System.out.println(toLowerCase(second));
	}

	static String readString() {
		System.out.println("Enter your string : ");
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			input = scanner.nextLine();
		} while (validateInput(input));

		return input;

	}

	static boolean validateInput(String input) {
		if (input.length() >= 40) {
			System.out.println("The string that you entered is with length more then 40 charekters!Please try again!");
			return true;
		}
		for (int i = 0; i < input.length(); i++) {
			if ((input.charAt(i) < 'A' || input.charAt(i) > 'Z') && (input.charAt(i) < 'a' || input.charAt(i) > 'z')) {
				System.out.println("The string that you enter is containing chareckters diffrent from A-Z or a-z!");
				return true;
			}
		}

		return false;
	}

	static String toUpperCase(String input) {
		String result = input.toUpperCase();
		return result;
	}

	static String toLowerCase(String input) {
		String result = input.toLowerCase();
		return result;
	}
}
