import java.util.Scanner;

public class Task7 {
	/**
	 * To be made a program which is reading two values real number for money
	 * and boolean for health status for more reference open textbook "Java for
	 * everyone" on page 66
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter how much money do you have : ");
		double myMonyey = scanner.nextDouble();

		System.out.println("Enter true if you are healty of false if you are not : ");
		boolean amIHealty = scanner.nextBoolean();

		if (amIHealty) {
			if (myMonyey > 10.0) {
				System.out.println("You should go out with friends to the cinema !");
			} else {
				System.out.println("You should go out for a walk !");
			}
		} else {
			if (myMonyey > 10.0) {
				System.out.println("You should buy medicines !");
			} else {
				System.out.println("You should stay at your home and drink tea !");
			}
		}

	}
}
