import java.util.Scanner;

public class Task4 {
	/**
	 * To be made a program which read from the console 3 numbers and print true
	 * or false if this sides can build triangle!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(
				"Enter a tree number to check is it possible this numbers to form a triangle!\nEnter first number : ");
		double firstNumber = scanner.nextDouble();
		
		System.out.println("Enter second number :");
		double secondNumber = scanner.nextDouble();
		
		System.out.println("Enter third number ");
		double thirdNumber = scanner.nextDouble();

		boolean isFirstSideTriangle = firstNumber < secondNumber + thirdNumber;
		boolean isSecondSideTriangle = secondNumber < firstNumber + thirdNumber;
		boolean isThirdSideTriangle = thirdNumber < firstNumber + secondNumber;

		boolean isTriangle = isFirstSideTriangle && isSecondSideTriangle && isThirdSideTriangle;

		System.out.println("It is " + isTriangle + " that this numbers can form a triangle !");

	}

}
