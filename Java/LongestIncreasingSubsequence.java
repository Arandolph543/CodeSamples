/* Longest increasing subsequence in an integer array. 
Author: April Randolph
Date: 06/21/20, 08/04/20*/
import java.util.*;
import java.io.*;
import java.lang.*;

class LongestIncreasingSubsequence {
	
	static int findLongestIncreasing(int[] array, int, index, int n. int seqLength) {
		int tempSeqLength = 1;
		int num = array[0];
		if(n==0 | n==1)
			return 1;
		for(int i = index;i<n;i++) {
			if(array[i]>num) {
				tempSeqLength++;
				num = array[i];
                                index = i;
			}
		}
                 seqLength = Math.max(tempSeqLength, seqLength);
	         if (n-tempSeqLength>seqLength){
                    return findLongestIncreasing(array,index,n,tempSeqLength);
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
                        int seqLength=1;
                        int increasingSubsequence = findLongestIncreasing(arr, 0, array.length,seqLength);
			System.out.println("The number of increasing subsequence is: " + increasingSubsequence);
			
		} catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
