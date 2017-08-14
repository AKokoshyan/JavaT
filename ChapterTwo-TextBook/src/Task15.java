import java.util.Scanner;

public class Task15 {
	/**
	 * To be made a program which is reading 5 boolean values and to print true
	 * if all are true!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter five boolean variables and the program will print true if all are true!\nEnter first boolean value : ");
		boolean firstNumber = scanner.nextBoolean();
		System.out.println("Enter second boolean value : ");
		boolean secondNumber = scanner.nextBoolean();
		System.out.println("Enter third boolean value : ");
		boolean thirdNumber = scanner.nextBoolean();
		System.out.println("Enter fourth boolean value : ");
		boolean fourthNumber = scanner.nextBoolean();
		System.out.println("Enter fifth boolean value : ");
		boolean fifthNumber = scanner.nextBoolean();

		System.out.println("Are all true : "
				+ (firstNumber && secondNumber && thirdNumber && fourthNumber && fifthNumber ? true : false));
	}	

}
