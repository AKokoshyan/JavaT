import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		String customerInput = readInput();
		System.out.println(isPalindrom(customerInput) ? "yes" : "no");
	}

	static String readInput() {
		Scanner scanner = new Scanner(System.in);
		String customerInput = scanner.nextLine();
		return customerInput;
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
