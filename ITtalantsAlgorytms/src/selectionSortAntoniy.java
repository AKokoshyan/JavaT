public class selectionSortAntoniy {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 0; i < args.length; i++) {
			counter++;
		}
		System.out.println(counter);
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

	static void bubbleSort(int[] arr) {
		boolean isSorted = true;
		for (int i = 0; i < arr.length; i++) {
			isSorted = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorted = true;
				}
			}
			if (!isSorted) {
				break;
			}
		}
	}

	static void selectionSort(int[] array) {
		int start = 0;
		int end = array.length - 1;
		int count = 0;

		for (int i = 0; i < array.length / 2; i++) {

			int minIndex = start;
			int maxIndex = start;

			for (int j = start; j <= end; j++) {
				count++;
				if (array[maxIndex] < array[j]) {
					maxIndex = j;
				}
				if (array[minIndex] > array[j]) {
					minIndex = j;
				}
			}

			int temp = array[maxIndex];
			array[maxIndex] = array[end];
			array[end] = temp;

			if (minIndex == end) {
				minIndex = maxIndex;
			}

			temp = array[minIndex];
			array[minIndex] = array[start];
			array[start] = temp;

			start++;
			end--;
		}
		System.out.println("Number of iterations : " + count);
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
