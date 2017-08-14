import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[7];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element :");
			array[i] = scanner.nextInt();
		}

		int swap = array[0];

		for (int i = 0; i < array.length - 1; i++) {
			if (i == 0) {
				array[i] = array[i + 1];
				array[i + 1] = swap;
			} else if (i == 2) {
				swap = array[i] + array[i + 1];
				array[i] = swap - array[i];
				array[i + 1] = swap - array[i];
			} else if (i == 4) {
				swap = array[i] * array[i + 1];
				array[i] = swap / array[i];
				array[i + 1] = swap / array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
