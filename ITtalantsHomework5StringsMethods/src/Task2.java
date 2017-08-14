import java.util.Scanner;

public abstract class Task2 {

	public static void main(String[] args) {
		String first = readString();
		String second = readString();

		slapFirstFiveCharecters(first, second);

	}

	static String readString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string : ");
		String input;
		do {
			input = scanner.nextLine();
		} while (validateInput(input));

		return input;
	}

	static boolean validateInput(String input) {
		if (input.length() < 10 || input.length() > 20) {
			System.out.println("The length of the string is not in range of 10 to 20 chareckters!Please try again !");
			return true;
		}

		for (int i = 0; i < input.length(); i++) {
			if ((input.charAt(i) < 'a' || input.charAt(i) > 'z') && (input.charAt(i) < 'A' || input.charAt(i) > 'Z')) {
				System.out.println(
						"The string that you enter is containing symbols out of range A-Z or a-z!Please try again!");
				return true;
			}
		}

		return false;
	}



	static void slapFirstFiveCharecters(String first, String second) {
		char temp;
		char secondTemp;
		for (int i = 0; i < 5; i++) {
			temp = second.charAt(i);
			secondTemp = first.charAt(i);
			first = first.replace(first.charAt(i), temp);
			second = second.replace(second.charAt(i), secondTemp);
		}
		if (first.length() > second.length()) {
			System.out.println(first);
		} else {
			System.out.println(second);
		}
	}
}
