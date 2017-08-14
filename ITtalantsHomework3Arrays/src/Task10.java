import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a positive number ang greater than 0 for length of array ! The program will found the avarage of the elements of the array and will print the avarage value and the closest element to the avarage value!\nEnter your number :");
		int lengthArray = validateLengthArray();

		int[] array = new int[lengthArray];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		int avaregeSum = sum / lengthArray;

		int distantDifference = Integer.MAX_VALUE;
		int currentClosest = 0;
		int closestElement = 0;

		for (int i = 0; i < array.length - 1; i++) {

			currentClosest = Math.abs(avaregeSum - array[i]);

			if (currentClosest < distantDifference) {
				distantDifference = currentClosest;
				closestElement = array[i];
			}
		}
		System.out.println("The avarage sum is " + avaregeSum + " and the closest element is " + closestElement);
	}

	public static int validateLengthArray() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println(
						"The number that you entered is negative or equal to 0! Please try again!\nEnter your number : ");
			}
		} while (input < 1);
		return input;
	}
}
