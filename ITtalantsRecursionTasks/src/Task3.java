import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		primeTask();
	}
	//Recursive method for determine is the input number prime !
	static boolean isPrime(int x, int iter) {
		if (iter == x) {
			iter--;
		}
		if (iter == 1) {
			return true;
		}
		if (x % iter == 0) {
			return false;
		}

		return isPrime(x, iter - 1);
	}
	//Method for reading the input and validate it to be natural number!
	static int readNumber() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			input = scanner.nextInt();
			if (input < 1) {
				System.out.println("The number that you entered is not natural !Please try again !");
			}
		} while (input < 1);
		return input;
	}
	//Method for starting the task!
	static void primeTask() {
		System.out.println("Enter a natural number and program will tell you is prime or not !");
		int customerNumber = readNumber();

		System.out.println(
				isPrime(customerNumber, customerNumber) ? "The number is prime !" : "The number is not prime !");

	}
}
