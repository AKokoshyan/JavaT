import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		printTotalTries();
	}

	static int throwSevenConsecSeven() {
		Random random = new Random();
		int firstDice = 0;
		int secondDice = 0;
		int sum = 0;
		int totalTries = 0;
		int counterSeven = 0;

		do{
			firstDice = random.nextInt(5) + 1;
			secondDice = random.nextInt(5) + 1;
			sum = firstDice + secondDice;
			if (sum == 7) {
				counterSeven++;
			} else {
				counterSeven = 0;
			}
			totalTries++;
		}while (counterSeven <= 7);

		return totalTries;
	}

	static void printTotalTries() {
		System.out.println(throwSevenConsecSeven());
	}
}
