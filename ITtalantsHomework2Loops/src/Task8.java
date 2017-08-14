import java.util.Scanner;

public class Task8 {
	/**
	 * To be made a program which is read a number (not sure must be natural number or not ) and to print square as per condition !
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number and program will print a square of numbers ");
		int inputNumber = scanner.nextInt();

		int numberToPrint = inputNumber - 1;

		for (int i = 0; i < inputNumber; i++) {
			for (int j = 0; j < inputNumber; j++) {
				System.out.print(numberToPrint);
			}
			numberToPrint += 2;
			System.out.println();
		}

	}

}
