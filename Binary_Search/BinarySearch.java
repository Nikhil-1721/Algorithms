
public class BinarySearch {
	
	private static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		
		while (start <= end) {
			
			 mid = (start + end)/2;
			
			 if (mid == target) {
				return mid;
			}
			 else if (target < mid) {
				end = mid - 1;
				
			}
			 else {
				start = mid + 1;
			}
		}
		return mid;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 6, 11, 16, 18, 21};
		int value = binarySearch(arr, 6);
		System.out.println(value);
		
	}

	

}
