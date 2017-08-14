import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line: ");
		String line = sc.nextLine();

		String currentNumber = "";
		int sum = 0;
		char currentChar;
		for (int i = 0; i < line.length(); i++) {
			currentChar = line.charAt(i);
			if (currentChar >= '0' && currentChar <= '9') {
				currentNumber += currentChar;
			} else {
				if (!currentNumber.equals("") && !currentNumber.equals("-")) {
					sum += Integer.valueOf(currentNumber);
					currentNumber = "";
				}

				if (currentChar == '-') {
					currentNumber = "-";
				}
			}
		}

		if (!currentNumber.equals("") && !currentNumber.equals("-")) {
			sum += Integer.valueOf(currentNumber);
			currentNumber = "";
		}

		System.out.println("The sum is " + sum);
	}
}
