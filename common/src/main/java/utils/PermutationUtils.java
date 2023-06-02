package utils;

public class PermutationUtils {

	public static <T extends Comparable<T>> boolean getNextPermutation(T[] array) {
		if (array.length <= 1) {
			return false;
		}
		int last = array.length - 2;
		while (last >= 0) {
			if (array[last].compareTo(array[last + 1]) < 0) {
				break;
			}
			last--;
		}
		if (last < 0) {
			return false;
		}
		int nextGreater = array.length - 1;
		for (int i = array.length - 1; i > last; i--) {
			if (array[i].compareTo(array[last]) > 0) {
				nextGreater = i;
				break;
			}
		}
		swap(array, nextGreater, last);
		reverse(array, last + 1, array.length - 1);
		return true;
	}

	private static <T> void swap(T[] array, int left, int right) {
		T temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	private static <T> void reverse(T[] array, int left, int right) {
		while (left < right) {
			T temp = array[left];
			array[left++] = array[right];
			array[right--] = temp;
		}
	}
}
