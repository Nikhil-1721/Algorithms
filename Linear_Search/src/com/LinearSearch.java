package com;

public class LinearSearch {
	
	//This is a linear search
	static int searach(int[] arr, int element) {
		if (arr.length == 0) {
			return -1;
		}
		
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == element) {
				return index;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] array = {10,15, 21, 7, 92, 83};
		
		int index = searach(array, 21);
		System.out.println(index);
		
	}
	
	
}
