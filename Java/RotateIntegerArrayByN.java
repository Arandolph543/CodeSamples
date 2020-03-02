/*Description: Rotate an array. 
Author: April Randolph
Date: 02/28/2020*/

import java.util.*;
import java.lang.*;


class RotateIntegerArrayByN {

	static int[] rotateArray(int[] arr, int n) {
		
		int length = arr.length;
		int zeroArrCount = 0;
		int[] rotateArray = new int[length];
		
		if(length==0 || length==1)
			return arr;
		
		int[] NArray = new int[length];

		int[] Array = new int[length];
		int i  = 0;
		Arrays.sort(arr);
		
        System.arraycopy(arr, 0, rotateArray, 0, n);
		System.out.println("Debug: " + Arrays.toString(rotateArray) + Arrays.toString(Array));
        System.arraycopy(arr, n, rotateArray, n, length);
		System.out.println("Debug: " + Arrays.toString(rotateArray) + Arrays.toString(Array));
		
		if(arr[0]==1 && arr[length-1]==length)
			return arr;
		for(i = 0;i<length;i++) {
			if(rotateArray[i]==0)
				zeroArrCount++;
		}
		if(zeroArrCount==length)
			return arr;
		
		return rotateArray;

	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		System.out.println("Array " + Arrays.toString(array) + " " + Arrays.toString(rotateArray(array, 5)));
    }
}
