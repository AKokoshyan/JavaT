import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int lengthArray = scanner.nextInt();

		int[] array = new int[lengthArray];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextInt();
		}

		boolean isGreater = false;
		boolean isZigZag = true;

		for (int i = 0; i < array.length - 1; i++) {
			if (isGreater) {
				if (array[i] > array[i + 1]) {
					isZigZag = true;
					isGreater = false;
				} else {
					isZigZag = false;
					break;
				}
			} else {
				if (array[i] < array[i + 1]) {
					isZigZag = true;
					isGreater = true;
				} else {
					isZigZag = false;
					break;
				}
			}
		}

		System.out.println(isZigZag ? "true" : "false");

	}

}
