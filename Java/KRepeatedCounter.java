/*Description: Find the number of times the count of k occurs returning an int.
Author: April Randolph
Date: 08/22/20 */

class KRepeatedCounter {
	
	static int findCountOfK(int[] arr, int n, int k) {
		int count = 0;
		int lowest = arr[0];
		int highest = arr[n-1];
		
		if(k >= lowest && k <= highest) {
			for(int i = 0;i<n;i++) {
				if(arr[i] == k) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 3, 5, 6, 7, 8, 9};
		System.out.println(findCountOfK(arr, arr.length, 3));
	}

}
