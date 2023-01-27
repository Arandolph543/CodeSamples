/*Description: Integer array used to find increasing array with the largest sum.
Author: April Randolph
Date:08/21/20*/
public class IncreasingSum {

	static int findLargestIncreasingSum(int[] arr, int n) {
		int sum = 0;
		int largest = 0;
		for(int i = 0;i<n;i++) {
			if(i==0) {
				sum += arr[i];
				largest = i;
			}
			if(i > 0 && arr[i] > arr[i-1]) {
				sum += arr[i];
				if(arr[i] > arr[largest]) {
					largest = i;
				}
			} else if(i > 1 && arr[i] < arr[i-1] && arr[i] > arr[i-2]) {
				if(arr[i] < arr[largest]) {
					sum -= arr[largest];
					largest = i-1;
				} 
				if(arr[i] < arr[i-1]) {
					sum += arr[i];
				}
			} else if(i > 0 && arr[i] < arr[i-1] && largest == i-1) {
				sum -= arr[i-1];
			} 
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] array  = {1, 100, 4, 7, 106};
		int n = array.length;
		System.out.println("largest sum: " + findLargestIncreasingSum(array, n));

	}
}
