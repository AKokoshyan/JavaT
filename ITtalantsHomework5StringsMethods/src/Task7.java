import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		String customerInput = readInput();
		String[] words = convertStringToArray(customerInput);
		int longestWord = getLengthLongestWord(words);
		System.out.println("The string is containing " + words.length + " and the longest word is from " + longestWord
				+ " charecters !");
	}

	static String readInput() {
		Scanner scanner = new Scanner(System.in);
		String input;
		System.out.println("Enter a string which contains spaces : ");
		do {
			input = scanner.nextLine();
		} while (validateInput(input));
		return input;
	}

	static boolean validateInput(String input) {
		boolean thereIsNoSpaces = true;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				thereIsNoSpaces = false;
				break;
			}
		}
		if (thereIsNoSpaces) {
			System.out.println(
					"The String that you enter is not containing spaces! Please enter space in your String !\nEnter your String : ");
			return thereIsNoSpaces;
		} else {
			return thereIsNoSpaces;
		}
	}

	static String[] convertStringToArray(String input) {
		String[] words = input.split(" ");
		return words;
	}

	static int getLengthLongestWord(String[] words) {
		int longestWord = 0;
		int currentLongestWord = 0;

		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				currentLongestWord++;
			}
			if (longestWord < currentLongestWord) {
				longestWord = currentLongestWord;
			}
			currentLongestWord = 0;
		}
		return longestWord;
	}
}
