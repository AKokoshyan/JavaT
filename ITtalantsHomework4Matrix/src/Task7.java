import java.util.Scanner;

public abstract class Task7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[6][6];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("Enter value for element in position " + (i + 1) + " " + (j + 1));
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		int totalSumElemnts = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			if(i%2==0){
				totalSumElemnts+= (matrix[i][0]+matrix[i][2]+matrix[i][4]);
			}else {
				totalSumElemnts+=(matrix[i][1]+matrix[i][3]+matrix[i][5]);
			}
		}
		
		System.out.println(totalSumElemnts);
	}

}
