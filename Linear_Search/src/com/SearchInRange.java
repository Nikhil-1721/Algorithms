package com;

// Search for a given element in a specified range
public class SearchInRange {

	static boolean searchInRange(int[] arr, int target, int start, int end) throws Exception {

		if (arr.length <= 0) {
			throw new NegativeArraySizeException("Array size should be greater than zero");
		}

		for (int index = start; index <= end; index++) {
			if (arr[index] == target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int[] array = { 3, 18, 7, 22, 83, 16 };
		boolean result = false;
		try {
			result = searchInRange(array, 18, 2, 4);
		} catch (Exception e) {

			e.printStackTrace();
		}

		System.out.println(result);
	}

}
