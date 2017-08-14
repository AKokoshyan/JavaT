import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		System.out.println("Enter a number from 1 to 52 and the program will print the remaining cards in the deck !");
		int inputNumber = validateInput();

		int nextCard = 0;
		int nextColor = 0;

		for (int i = inputNumber; i <= 52; i++) {
			nextCard = ((i - 1) / 4) + 1;
			nextColor = ((i - 1) % 4) + 1;

			switch (nextCard) {
			case 1:
				System.out.print("Two");
				break;
			case 2:
				System.out.print("Tree");
				break;
			case 3:
				System.out.print("Four");
				break;
			case 4:
				System.out.print("Five");
				break;
			case 5:
				System.out.print("Six");
				break;
			case 6:
				System.out.print("Seven");
				break;
			case 7:
				System.out.print("Eight");
				break;
			case 8:
				System.out.print("Nine");
				break;
			case 9:
				System.out.print("Ten");
				break;
			case 10:
				System.out.print("Jack");
				break;
			case 11:
				System.out.print("Queen");
				break;
			case 12:
				System.out.print("King");
				break;
			case 13:
				System.out.print("Ace");
				break;
			}

			switch (nextColor) {
			case 1:
				System.out.print(" club ");
				break;
			case 2:
				System.out.print(" diamonds");
				break;
			case 3:
				System.out.print(" heart");
				break;
			case 4:
				System.out.print(" spades");
				break;
			}
			System.out.println();
		}

	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);

		int input;

		do {
			input = scanner.nextInt();
			if (input < 1 || input > 52) {
				System.out.println(
						"The number that you entered is out of range from 1 to 52! Please try again !\nEnter your number : ");
			}
		} while (input < 1 || input > 52);
		return input;
	}

}
