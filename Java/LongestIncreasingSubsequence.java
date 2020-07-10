/* Longest increasing subsequence in an integer array. 
Author: April Randolph
Date: 06/21/20*/
import java.util.*;
import java.io.*;
import java.lang.*;

class LongestIncreasingSubsequence {
	
	static int findLongestIncreasing(int[] array) {
		int seqLength = 1;
		int length = array.length;
		int num = array[0];
		if(length==0 | length==1)
			return 1;
		for(int i = 0;i<length;i++) {
			if(array[i]>num) {
				seqLength++;
				num = array[i];
			}
		}
	
		return seqLength;
	}
	
	public static void main(String[] args) {
		try {
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter a number array separated by spaces:");
			String[] array = buffer.readLine().split(" ");
			int[] arr = new int[array.length];
			for(int i = 0; i<array.length;i++ ) {
				arr[i] = Integer.parseInt(array[i]);
			}
			int increasingSubsequence = findLongestIncreasing(arr);
			System.out.println("The number of increasing subsequence is: " + increasingSubsequence);
			
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
