/*Description: Find the missing number or numbers in the int array returning a 1 if all numbers are negative
and the input array if all numbers are accounted for. The array is given unsorted and can contain numbers larger
than the size of the array. Return an array of the missing integers.
Author: April Randolph
Date: 03/01/20 */

import java.util.*;
import java.lang.*;

class MissingInteger {

	static int findInteger(int[] A) {
		int length = A.length;
		int missingNum = 0;
		if(length==0)
			return A;

		Arrays.sort(A);
		int[] tempArray = new int[length*length];		
		for(j = 0;j<tempArray.length;j++) {
			for(int k=0;k<A.length;k++) {
				if(A[k]==j)
					tempArray[j] = 1;
			}
		}
		for(int i = 1;i<A[length-1]+1;i++) {
			for(int k=0;k<A.length;k++) {
				if(tempArray[i] != 1) {
					missingNum = i;
				}
			}
		}
		if(missingNum>0
			return missingNum;
		boolean increasingArray = false;
		for(int i = 0;i<length;i++) {
			if(A[i]==(i+1)) {
				increasingArray = true;
			}
		}
		if(increasingArray)
			return (A[length-1]+1);
		if(A[length-1]<=0) {
			missingNum = 1;
		}
		
		return missingNum;
	}

    static int[] findIntegers(int[] A) {
		int length = A.length;
		
		if(length==0)
			return A;
		
		int j = 0;
		Arrays.sort(A);
		int[] tempArray = new int[length*length];		
		for(j = 0;j<tempArray.length;j++) {
			for(int k=0;k<A.length;k++) {
				if(A[k]==j)
					tempArray[j] = 1;
			}
		}
		int[] missingNums = new int[A.length*A.length];
			
		for(int i = 1;i<A[length-1]+1;i++) {
			for(int k=0;k<A.length;k++) {
				if(tempArray[i] != 1) {
					missingNums[i] = i;
				}
			}
		}
		if(A[length-1]==length)
			return A;
		if(A[length-1]<=0) {
			missingNums[0] = 1;
		}
        return missingNums;
	}

	public static void main(String[] args) {
	    int[] array = {1,2,3,4};	
		int[] result = findInteger(array);
		for(int i =0;i<result.length;i++) {
			if(result[i]>0)
				System.out.println(result[i]);
		}
	}

}
