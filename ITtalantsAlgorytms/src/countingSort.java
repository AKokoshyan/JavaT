import java.lang.reflect.Array;

public class countingSort {

	public static void main(String[] args) {
		int[] arr = { 0, -1 };
		countingSort(arr);
		printArray(arr);
	}

	static void countingSort(int[] arr) {
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		int[] helper = new int[max - min + 1];

		for (int i = 0; i < arr.length; i++) {
			helper[arr[i] - min]++;
		}

		int originalIndex = 0;

		for (int i = 0; i < helper.length; i++) {
			while (helper[i] > 0) {
				arr[originalIndex] = min + i;
				originalIndex++;
				helper[i]--;
			}
		}
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
