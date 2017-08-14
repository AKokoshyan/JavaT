import java.util.Scanner;

public class Task3 {
	/**
	 * To be made a program which read from console 2 sides of rectangle and
	 * calculating it's area!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter first side of the rectangle : ");
		double firstSide = scanner.nextDouble();

		System.err.println("Enter second side of the rectangle : ");
		double secondSide = scanner.nextDouble();

		double areaRectangle = firstSide * secondSide;

		System.out.println("The area of the rectangle is : " + areaRectangle);

	}

}
