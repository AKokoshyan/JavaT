import java.util.Scanner;

public class Task6 {
	/**
	 * To be made a program which is reading number from the console and print
	 * the sum of the row to 1! Corner case : input number is smaller then 0 !
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number and program will comput the sum of all numbers to 1\nEnter your number !");
		int inputNumber = scanner.nextInt();
		int sum = 0;

		int biggestNumber = inputNumber;
		int smallestNumber = 1;

		if (biggestNumber < smallestNumber) {
			biggestNumber = smallestNumber;
			smallestNumber = inputNumber;
		}

		for (int i = smallestNumber; i <= biggestNumber; i++) {
			sum += i;
		}

		System.out.println("The sum of all numbers between " + inputNumber + " and 1 is : " + sum);
	}

}
