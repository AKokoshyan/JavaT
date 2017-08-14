import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		findBigestEncounter();
	}

	static String readInput() {
		Scanner scanner = new Scanner(System.in);
		String input;
		do {
			input = scanner.nextLine();
		} while (validateInput(input));
		return input;
	}

	static boolean validateInput(String input) {
		boolean noSpaces = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				noSpaces = false;
				break;
			}
		}
		if (noSpaces) {
			System.out.println(
					"The string that you entered have no spaces! Please write a string with atleast one space! Try agian!");
			return noSpaces;
		} else {
			return noSpaces;
		}
	}

	static void findBigestEncounter() {
		String customerString = readInput();
		String mostFrequentWord = "";
		String[] words = customerString.split(" ");
		int currentEncounter = 0;
		int bigestEncounter = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (i == j) {
					continue;
				}
				if (words[i].equals(words[j])) {
					currentEncounter++;
				}
			}
			if (bigestEncounter < currentEncounter) {
				mostFrequentWord = words[i];
			}
			currentEncounter = 0;
		}

		System.out.println("The most frequent word in the string is : " + mostFrequentWord);
	}
}
