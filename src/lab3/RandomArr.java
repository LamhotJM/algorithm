package lab3;

public class RandomArr {

	public static int[] randomArray(int n) {
		int[] retVal = new int[n];
		for (int i = 0; i < n; ++i) {
			retVal[i] = i;
		}
		for (int i = 0; i < n; ++i) {
			swap(retVal, i, RandomNumbers.getRandomInt(i, n - 1));
		}
		return retVal;
	}

	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}