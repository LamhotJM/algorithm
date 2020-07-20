package lab2.problem3;

public class Problem3 {
	public int[] merge(int[] arr1, int[] arr2) {
		if (arr1 == null || arr2 == null || arr1.length <= 0 || arr2.length <= 0)
			return null;
		int[] result = new int[arr1.length + arr2.length];

		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				result[k] = arr1[i++];
			} else {
				result[k] = arr2[j++];
			}
			k++;
		}

		while (i < arr1.length) {
			result[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			result[k++] = arr2[j++];
		}
		return result;
	}
}
