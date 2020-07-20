package lab3;

public class Permutation {
	public static int[] permute(int[] arr) {
		int[] indices = RandomArr.randomArray(arr.length);
		return Permutation(indices, arr);
	}

	public static int[] Permutation(int[] indices, int[] arr) {
		if (indices == null || arr == null || arr.length != indices.length) {
			return arr;
		}
		int[] retVal = new int[arr.length];
		for (int i = 0; i < arr.length; ++i) {
			retVal[i] = arr[indices[i]];
		}
		return retVal;
	}
}