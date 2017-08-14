import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		String input = readInput();
		System.out.println(isPalindrom(input) ? "The string is palindrom" : "No the string is not palindrom");
	}

	static String readInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}

	static boolean isPalindrom(String input) {
		boolean isPalindrom = true;
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				isPalindrom = false;
				break;
			}
		}
		return isPalindrom;
	}
}
