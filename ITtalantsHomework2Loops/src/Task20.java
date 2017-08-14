
public class Task20 {
	/**
	 * To be made a program which is printing a square which sum of the elements
	 * of row and column is 45 !
	 */

	public static void main(String[] args) {
		int counter = 1;
		int secondCounter = 0;

		for (int i = 1; i <= 10; i++) {
			while (counter <= 9) {
				System.out.print(counter);
				counter++;
			}

			for (int j = 0; j < i; j++) {
				System.out.print(secondCounter);
				secondCounter++;
			}

			System.out.println();
			counter = i + 1;
			secondCounter = 0;
		}

	}

}
