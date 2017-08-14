
public class binarySearch {

	public static void main(String[] args) {
		int[] arr = { 9, 7, 1, 4, 8, 3, 2, 5 };
		bubbleSort(arr);
		System.out.println(avarageSumArray(arr));
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

	static int binarySearch(int[] arr, int x, int left, int right) {
		int mid = (left + right) / 2;
		if (left > right) {
			return -1;
		}
		if (arr[mid] == x) {
			return mid;
		} else {
			if (arr[mid] > x) {
				return binarySearch(arr, x, left, mid - 1);
			} else {
				return binarySearch(arr, x, mid + 1, right);
			}
		}
	}

	static int avarageSumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum / arr.length;
	}
}
