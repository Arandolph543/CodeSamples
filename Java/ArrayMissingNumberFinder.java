/* Description: Array of integers with a missing number returns the integer missing from the array.
Author: April Randolph
Date: 10/20/2019 */

public class ArrayMissingNumberFinder {

	static int findMissingNumber(int[] nums) {
		int n = nums.length - 1;
		int i = nums[0];
		if(n == 0) 
			return i;
		
		for(int j = 1;j<n;j++) {
			if(nums[j] != j) {
				return j;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] numbers = {0, 1, 2, 3, 4, 5, 7, 8, 9};
		System.out.println(findMissingNumber(numbers));
	}
}
	
