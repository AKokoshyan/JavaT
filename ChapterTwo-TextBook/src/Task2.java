import java.util.Scanner;

public class Task2 {
	/**
	 * To be made a program which read from the console the radius of a circle
	 * and print the area of the circle!
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius of the circle and the program will compute the area ot the circle!");

		double radiusOfTheCircle = scanner.nextDouble();
		double areaOfTheCircle = Math.PI * radiusOfTheCircle * radiusOfTheCircle;

		System.out.println("The area of the circle is : " + areaOfTheCircle);

	}

}
