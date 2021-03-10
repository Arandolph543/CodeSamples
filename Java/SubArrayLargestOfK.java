/*Description: Finding the subarray with the largest sum of the size k. 
Author: April Randolph
Date: 03/10/21*/

import java.util.*;
public class SubArrayLargestOfK {

	static int findLargestSubarray(int[] numbers, int k) {
		int sum, maximum, curr_max =0;
		int[] maxSum = new int[numbers.length];
		maxSum[0] = numbers[0];
		for(int i = 0;i<numbers.length;i++) {
			maximum = Math.max(sum, maximum+numbers[i]);
			maxSum[i] = maximum;
		}
		
		for(int j = 0;j<k;j++) {	
			sum += numbers[j];
		}	

		int curr_max = 0;
		int tempNum = sum;
		for(int l = k;l<numbers.length;l++) {
			sum = sum + numbers[l] - numbers[l-k];
			
			System.out.println("Maximum : " + tempNum);
			curr_max = Math.max(tempNum, sum);
			maximum = Math.max(Math.max(curr_max,  maximum), sum + maxSum[l-k]));
		}
		return maximum;
	
	}

	public static void main(String[] args) {
		int[] numbers = {1,2,3,-10,-3};
		int k = 4;
		int KthSubArraysLargestSum = findLargestSubarray(numbers, k);
		System.out.println("Maximum : " + KthSubArraysLargestSum);
	}

}
