import java.util.Scanner;

public class Task101 {

	public static void main(String[] args) {
		String first = readInput();
		String second = readInput();

		System.out.println(returnNewString(first, second));
	}

	static String readInput() {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Enter your string :");
		do {
			input = sc.nextLine();
		} while (validateInput(input));

		return input;
	}

	static boolean validateInput(String input) {
		boolean coversCond = true;
		if (input.length() >= 1 && input.length() <= 20) {
			coversCond = false;
		} else {
			System.out.println("The string that you entered is out of range 1 to 20 ! Please try again!");

		}
		return coversCond;
	}

	static String returnNewString(String first, String second) {
		String temp = first;
		for (int i = 0; i < 5; i++) {
			first = first.replace(first.charAt(i), second.charAt(i));
			second = second.replace(second.charAt(i), temp.charAt(i));
		}

		if (first.length() > second.length()) {
			temp = first;
		} else {
			temp = second;
		}
		return temp;
	}
}
