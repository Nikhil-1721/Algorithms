package com;


public class MinNum {
	
	static int minNum(int arr[]) {
		
		int min = Integer.MAX_VALUE;
		
		if (arr.length <= 0) {
			return -1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		
		int[] array = {10, 7, 18, 31};
		int result = minNum(array);
		System.out.println(result);
		
	}

}
