import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[7];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			array[i] = scanner.nextInt();
		}

		System.out.println("The numbers which are greater than 5 and divisible by 5 are :");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 5 && array[i] % 5 == 0) {
				System.out.print(array[i] + " ");
			}
		}

	}
}
