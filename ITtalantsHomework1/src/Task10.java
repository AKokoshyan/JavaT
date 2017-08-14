import java.util.Scanner;

public class Task10 {
	/**
	 * To be made a program which is reading a volume of cistern and to be
	 * calculated how much times need to transfer water with two buckets of 2
	 * and 3 liters!
	 */

	public static void main(String[] args) {
		System.out.println(
				"Enter volume of cistern and program will calculate how much times will need to transfer the water with two buckets of 2 and 3 liters!\nEnter volume of the cistern : ");
		int inputVolume = validateInput();

		int firstBucket = 2;
		int secondBucket = 3;

		int transferTwoBuckets = inputVolume / (firstBucket + secondBucket);
		int remainingWater = inputVolume % (firstBucket + secondBucket);

		if (remainingWater == 0) {
			System.out.println(transferTwoBuckets + " times per " + firstBucket + " liters ");
			System.out.println(transferTwoBuckets + " times per " + secondBucket + " liters ");

		} else {
			if (remainingWater % 2 == 0 || remainingWater == 1) {
				System.out.println(transferTwoBuckets + " times per " + firstBucket + " liters ");
				System.out.println(transferTwoBuckets + " times per " + secondBucket + " liters ");
				System.out.println("and aditional "
						+ (remainingWater / firstBucket == 0 || remainingWater == 1 ? 1 : remainingWater / firstBucket)
						+ " times per " + firstBucket + " liters ");
			} else {
				System.out.println(transferTwoBuckets + " times per " + firstBucket + " liters ");
				System.out.println(transferTwoBuckets + " times per " + secondBucket + " liters ");
				System.out.println("and aditional " + " 1 times per " + secondBucket + " liters ");
			}
		}

	}

	public static int validateInput() {
		Scanner scanner = new Scanner(System.in);

		int input;
		do {
			input = scanner.nextInt();
			if (input < 10 || input > 9999) {
				System.out.println(
						"The number that you had enter is out of range of 10 to 9999! Please try again !\nEnter your number : ");
			}
		} while (input < 10 || input > 9999);
		return input;
	}

}
