import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String names = readNames();

		String bigestName = givesBigestNameByASCI(names);
		System.out.println(bigestName);
	}

	static String readNames() {
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			input = scanner.nextLine();
		} while (validateInput(input));
		return input;
	}

	static boolean validateInput(String input) {
		boolean thereIsSpace = true;
		boolean thereIsComma = true;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				thereIsSpace = false;
			}
			if (input.charAt(i) == ',') {
				thereIsComma = false;
			}
		}

		if (thereIsComma || thereIsSpace) {
			System.out.println("You have to separate the names by space and comma !Please try again!");
			return true;
		} else {
			return false;
		}
	}

	static String givesBigestNameByASCI(String names) {
		String[] array = names.split(",");

		int maxASCI = 0;
		int currentASCI = 0;
		int bigestName = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) == ' ') {
					continue;
				} else {
					currentASCI +=array[i].charAt(j);
				}
			}
			if (maxASCI < currentASCI) {
				maxASCI = currentASCI;
				bigestName = i;
			}
			currentASCI = 0;
		}

		return array[bigestName];
	}
}
