import java.util.Random;

public class Test2Task1 {

	public static void main(String[] args) {
		System.out.println("The program will calculate how much rolls need to troll 7 times and the sum of them is 7!");

		Random random = new Random();

		int firstDice;
		int secondDice;

		int counter = 0;
		int countSumToSeven = 0;
		int sum = 0;

		while (countSumToSeven != 7) {
			firstDice = random.nextInt(6) + 1;
			secondDice = random.nextInt(6) + 1;
			sum = firstDice + secondDice;
			if (sum == 7) {
				countSumToSeven++;
			} else {
				countSumToSeven = 0;
			}
			counter++;
		}

		System.out.println("The total rolls of sum of two dice is equal of 7 is " + counter);
	}

}
