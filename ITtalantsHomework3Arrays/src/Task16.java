import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double[] firstArray = new double[10];
		double[] secondArray = new double[10];

		for (int i = 0; i < firstArray.length; i++) {
			System.out.println("Enter " + (i + 1) + " element : ");
			firstArray[i] = scanner.nextDouble();
		}

		int currentNumber = 1;

		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i] < -0.231) {
				secondArray[i] = currentNumber * currentNumber + 41.25;
				currentNumber++;
			} else {
				secondArray[i] = currentNumber * firstArray[i];
				currentNumber++;
			}
		}

		for (int i = 0; i < firstArray.length; i++) {
			System.out.print(firstArray[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i] + " ");
		}
	}
}
