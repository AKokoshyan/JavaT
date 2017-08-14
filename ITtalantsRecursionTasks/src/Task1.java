
public class Task1 {

	public static void main(String[] args) {

		int indexFibonachi = 7;
		int nFibonachi = getNFibonachiNumber(indexFibonachi);

		System.out.println(nFibonachi);

	}

	static int getNFibonachiNumber(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		return getNFibonachiNumber(n - 1) + getNFibonachiNumber(n - 2);
	}
}
