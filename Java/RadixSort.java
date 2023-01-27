/* Description: Sort from least significant to the most significant the linear sort is 
for this radix the counting.
Author: April Randolph
Date: 02/22/2020*/

import java.io.*;
import java.util.*;

class RadixSort {

	static int getMax(int[] arr, int n) {
		int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
	}

	static void sortArray(int[] array, int m, int exp) {
		int output[] = new int[m];
		int i;
		int count[]  = new int[10];
		Arrays.fill(count, 0);
		//Count the array elements getting their count
		for(i = 0;i<m;i++)
			count[(array[i]/exp)%10]++;
		
		//Reput the elements back into the output array with the actual indexes.
		for(i =1; i<10;i++)
			count[i] += count[i-1];
		
		for(i = m-1;i>=0;i--) {
			output[count[(array[i]/exp%10)]-1]=array[i];
			count[(array[i]/exp)%10]--;
		}
		for(i =0;i<m;i++)
			array[i] = output[i];
    }
	
	static void sortRadixArray(int arr[],int n) {
		int m = getMax(arr, n);
		for(int exp = 1;m/exp>0;exp*=10)
			sortArray(arr, n, exp);
	}
	
	static void print(int[] array) {
		for(int i =0;i<array.length;i++){
			System.out.print(array[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int[] array= {170,45,75,90,802,24,2,66};
		sortRadixArray(array, array.length);
		print(array);
	}


}