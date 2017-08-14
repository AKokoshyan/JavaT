import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String firstString = scanner.nextLine();
		System.out.println("Enter first string : ");
		String secondString = scanner.nextLine();

		int firstStringMatchIndex = -1;
		int secondStringMatchIndex = -1;

		boolean isNotContaining = true;
		for (int i = 0; i < firstString.length(); i++) {

			char current = firstString.charAt(i);

			if (secondString.indexOf(current) >= 0) {
				firstStringMatchIndex = i;
				secondStringMatchIndex = secondString.indexOf(current);
				isNotContaining = false;
				break;
			}
		}
		if (!isNotContaining) {
			String empty = "";
			int repeater = firstStringMatchIndex;
			while (repeater > 0) {
				empty += " ";
				repeater--;
			}

			int secIterator = 0;
			int firstIterator = 0;

			while (firstIterator < firstString.length() || secIterator < secondString.length()) {
				if (firstIterator == secondStringMatchIndex) {
					System.out.println(firstString);
				} else {
					System.out.print(empty);
					System.out.println(secondString.charAt(secIterator));
				}
				firstIterator++;
				secIterator++;
			}
		} else {
			System.out.println("There are not equal charectars !");
		}
	}

}
