
public class Task2 {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;

		System.out.println(multiplyTwoNumbers(x, y));

	}

	static int multiplyTwoNumbers(int x, int y) {
		if (y == 1) {
			return x;
		}

		return x + multiplyTwoNumbers(x, y - 1);
	}
}
