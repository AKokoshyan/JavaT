import java.util.Scanner;

public class Task13 {
	/**
	 * To be made a program which is reading tree sides of triangle and print
	 * the area and the perimeter!
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter tree values for sides of triangle and the program will calculate the perimeter and the area!\nEnter value for the 'a' side : ");
		int firstSide = scanner.nextInt();
		
		System.out.println("Enter value for the 'b' side : ");
		int secondSide = scanner.nextInt();
		
		System.out.println("Enter value for the 'c' side : ");
		int thirdSide = scanner.nextInt();

		int perimeterTriangle = firstSide + secondSide + thirdSide;
		int semiPerimeterTriangle = perimeterTriangle / 2;
		int areaTriangle = (int) Math.sqrt(semiPerimeterTriangle * (semiPerimeterTriangle - firstSide)
				* (semiPerimeterTriangle - secondSide) * (semiPerimeterTriangle - thirdSide));
		
		System.out.println("The area of the tirangle is : " + areaTriangle + "\nThe perimeter of the triangle is : "
				+ perimeterTriangle);
	}

}
