import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter a number for first two elements of an array with length 10 the other elemetns will be the sum of the two previous elemts!");
		int firstTwoElementsArray = scanner.nextInt();

		int[] array = new int[10];

		array[0] = firstTwoElementsArray;
		array[1] = firstTwoElementsArray;

		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 2] + array[i - 1];
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
