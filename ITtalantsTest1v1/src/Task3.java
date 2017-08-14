
public class Task3 {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 6, 7, 8, 9};
		System.out.println(getMinMaxDiffrenceArray(array, 1, array[0], array[0]));

	}

	static int getMinMaxDiffrenceArray(int[] arr, int index, int min, int max) {
		if (index == arr.length) {
			return max - min;
		}
		if (arr[index] < min) {
			min = arr[index];
		}
		if (arr[index] > max) {
			max = arr[index];
		}

		return getMinMaxDiffrenceArray(arr, index + 1, min, max);
	}
}
