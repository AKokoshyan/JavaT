import java.util.Scanner;

public class Task23 {

	public static void main(String[] args) {
		int firstNumber = 1;
		int secondNumber = 1;

		while (firstNumber < 10) {
			while (secondNumber < 10) {
				System.out.print(firstNumber + "*" + secondNumber + " ");
				secondNumber++;
			}
			System.out.println();
			firstNumber++;
			secondNumber = firstNumber;
		}
	}

}
