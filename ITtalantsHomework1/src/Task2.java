import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println(
				"Enter two numbers and the program will find their sum, substruction, multiplication, modul and division !\nEnter first number : ");
		int inputFirstNum = scanner.nextInt();

		System.out.println("Enter second number : ");
		int inputSecondNum = scanner.nextInt();

		int sum = inputFirstNum + inputSecondNum;
		int substurction = inputFirstNum - inputSecondNum;
		int multiplication = inputFirstNum * inputSecondNum;
		int modul = inputFirstNum % inputSecondNum;
		int division = inputFirstNum / inputSecondNum;

		System.out.println("The sum of " + inputFirstNum + " and " + inputSecondNum + " is : " + sum);
		System.out.println("The substurction of " + inputFirstNum + " and " + inputSecondNum + " is : " + substurction);
		System.out.println(
				"The multiplication of " + inputFirstNum + " and " + inputSecondNum + " is : " + multiplication);
		System.out.println("The modul of " + inputFirstNum + " and " + inputSecondNum + " is : " + modul);
		System.out.println("The division of " + inputFirstNum + " and " + inputSecondNum + " is : " + division);
	}

}
