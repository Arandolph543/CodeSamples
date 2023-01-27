/* Description: Given an Integer array find the longest subarray of length k.
Author: April Randolph
Date: 10/19/2019 */
import java.util.HashMap;

class LongestSubarrayOfK {

	public static int findLongestSubarrayOfK(int[] array, int length, int k) {
		HashMap<Integer, Integer> subarray = new HashMap<>();
		int largest = 0, sum = 0;
		for(int i = 0;i<length;i++) {
			
			sum += array[i];
			
			if(sum == k) {
				largest = i + 1;
			}
			if(!subarray.containsKey(k)){
				subarray.put(sum, i);
			}
			if(subarray.containsKey(sum - k)) {
				if(largest < (i - subarray.get(sum - k))) {
					largest = (i - subarray.get(sum - k));
				}
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		int[] arr = {10, 5, 2, 7, 1, 9}; 
		int n = arr.length; 
		int k = 15; 
		System.out.println("Length = " +  findLongestSubarrayOfK(arr,n, k));
	}

}
