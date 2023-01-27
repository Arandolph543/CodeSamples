/*Description: Sort the integer array using insertion sort algorithm given the array.
Author: April Randolph
Date: 08/21/20*/

public class insertionSortRecursive {

	static void insertionSortRecursive(int[] arr, int n) {
	
		if(n <=1)
			return;
	
		insertionSortRecursive(arr, n-1);
		
		int last = arr[n-1];
		int j = n-2;
		
		while(j >= 0 && arr[j] > last) {
			if(arr[j] > arr[n]) {
				arr[j+1] = arr[j];
				j--;
			}
		}
		arr[j+1] = last;
	}


	public static void main(String[] args) {
		int[] array = {12, 11, 3, 5, 2, 9};
		insertionSortRecursive(array, array.length);
		System.out.println(array.toString());	
	}

}
