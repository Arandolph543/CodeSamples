/*Description: An array of integers used to find the next largest integer from the array.
Author: April Randolph
Date:08/21/20*/
public class FindNextLargest {

	static int[] findNextLargest(int[] array) {
		int n = array.length;
		int[] nextLargest = new int[n];
		for(int m = 0;m<n;m++) {
			nextLargest[m] = -1;
		}
		for(int i=0;i<n;i++) {
		    for(int j = 0;j<n;j++) {			
				if(array[i] < array[j] && j > i) {
					nextLargest[i] = array[j];
					break;
				} 
		    }
		}
		return nextLargest;
	}

	public static void main(String[] args) {
		int[] arr = {2, 4, 4, 3, 5, 9};
		int[] foundLargerArr = findNextLargest(arr);
		for(int k = 0;k<arr.length;k++) {
			System.out.print(foundLargerArr[k] + " ");			
		}
	}
}
	
