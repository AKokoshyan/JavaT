import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		String name = readInput();

		printNameInitial(name);
	}

	static String readInput() {
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.println(
				"Enter a full name! The full name is from tree names : first name, father's name and family name! There must be spaces between them!");
		do {
			input = scanner.nextLine();
		} while (validateInput(input));
		return input;
	}

	static boolean validateInput(String input) {
		boolean isNotAlphabetic = false;
		int spaceCounter = 0;
		input = input.trim();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				spaceCounter++;
				continue;
			}

			if ((input.charAt(i) < 'a' || input.charAt(i) > 'z') && (input.charAt(i) < 'A' || input.charAt(i) > 'Z')) {
				isNotAlphabetic = true;
				break;
			}
		}

		if (isNotAlphabetic == false && spaceCounter == 2) {
			return false;
		} else {
			System.out.println(
					"The string that you enter is not valid name! It must had 2 spaces between each name and the names must be chareckters from alphabet ! Please try again !");
			return true;
		}
	}

	static void printNameInitial(String name) {
		name = name.trim();

		String[] allNames = name.split(" ");
		String nameInitial = "";

		for (int i = 0; i < allNames.length; i++) {
			nameInitial += allNames[i].charAt(0) + ".";
		}

		System.out.println("The initials of the name that you entered are " + nameInitial.toUpperCase());
	}
}
