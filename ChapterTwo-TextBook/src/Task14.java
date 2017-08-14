import java.util.Scanner;

public class Task14 {
	/**
	 * To be made a program which read one number and check is it even or odd
	 * and if its even print true else print false!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(
				"Enter a number and the program will tell you is it divisiable of 2 - true or false if it's not !\nEnter your number : ");
		int inputNumber = scanner.nextInt();
		
		System.out.println(inputNumber % 2 == 0 ? true : false);

	}

}
