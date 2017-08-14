import java.util.PrimitiveIterator;

public class Task4 {

	public static void main(String[] args) {
		printNumbers(10, 5);

	}

	static void printNumbers(int start, int iter) {
		if (iter == 1) {
			System.out.println(start);
			return;
		} else {
			printNumbers(start, iter - 1);
			for (int i = 0; i < iter; i++) {
				System.out.print(start + i + " ");
			}
			System.out.println();
		}

	}
}
